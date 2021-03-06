package speedTestProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class file_handler {
	
	private static final Pattern SPACE = Pattern.compile(" ");
	
	public static String createTextFile(String dateTime, double uploadSpeed, double downloadSpeed, double ping) throws IOException {
		//TODO: Check if file already exists, if not...
		String stringUploadSpeed = String.valueOf(uploadSpeed);
		String stringDownloadSpeed = String.valueOf(downloadSpeed);
		String stringPing = String.valueOf(ping);
		String writeSuccessfulFailed = null;
		
		List<String> lines = Arrays.asList(dateTime, stringUploadSpeed, stringDownloadSpeed, stringPing);
		Path file = Paths.get("speedTestProject\\speedTest.txt");
		Files.write(file, lines, StandardOpenOption.APPEND);
		
		writeSuccessfulFailed = "File and data successfully created.";
		System.out.print(writeSuccessfulFailed);
		return writeSuccessfulFailed;
	}
	public void ReadTextFile() throws IOException {
		
	   
	    File file = 
	      new File("C:\\Users\\Jordan\\eclipse-workspace\\advancedSoftwareDesign\\trunk\\advancedSoftwareDesign\\src\\speedTestProject\\output.txt"); 
	    Scanner sc = new Scanner(file);
	    String sentance = sc.nextLine();
	    
	    while (sc.hasNextLine()) {
	        System.out.println(sc.nextLine());

	    	}
		} 
	
	public void executeBat() throws IOException, InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "speedtest.bat");
		File dir = new File("C:\\Users\\Jordan\\eclipse-workspace\\advancedSoftwareDesign\\trunk\\advancedSoftwareDesign\\src\\speedTestProject");
		pb.directory(dir);
		Process p = pb.start();
		
		TimeUnit.SECONDS.sleep(30);
	}
	public void createGraphFile() throws IOException {
		
		try {
            BufferedReader myReader =
                    new BufferedReader(new FileReader("C:\\Users\\Jordan\\eclipse-workspace\\advancedSoftwareDesign\\trunk\\advancedSoftwareDesign\\src\\speedTestProject\\output.txt"));

            List<Double> myList = new ArrayList<Double>();
            int total = 0;
            String line;
            while ((line = myReader.readLine()) != null) {
                for (String token : SPACE.split(line)) {
                    try {
                        int i = 0;
                    	
                    	total += Double.parseDouble(token);
                        
                        myList.add(i, Double.parseDouble(token));
                        
                        i++;
                       
                    } catch (NumberFormatException ex) {
                        //System.err.println(token + " is not a number");
                    }
                }
            }

            myReader.close();
            
            System.out.println(myList);
            
            double uploadSpeed = myList.get(0);
            double downloadSpeed = myList.get(1);
            double ping = myList.get(2);
            Date date = new Date();
            
            createTextFile(String.valueOf(date), uploadSpeed, downloadSpeed, ping);
            
        } catch(FileNotFoundException e){

        } catch(IOException e){

        }
	}
}

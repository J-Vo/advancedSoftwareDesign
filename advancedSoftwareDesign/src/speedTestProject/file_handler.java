package speedTestProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.lang.SecurityException;

public class file_handler {
	
	public String createTextFile(String dateTime, double uploadSpeed, double downloadSpeed) throws IOException {
		//TODO: Check if file already exists, if not...
		String stringUploadSpeed = String.valueOf(uploadSpeed);
		String stringDownloadSpeed = String.valueOf(downloadSpeed);
		String writeSuccessfulFailed = null;
		
		List<String> lines = Arrays.asList(dateTime, stringUploadSpeed, stringDownloadSpeed);
		Path file = Paths.get("speedTest.txt");
		Files.write(file, lines, StandardOpenOption.APPEND);
		
		writeSuccessfulFailed = "File and data successfully created.";
		System.out.print(writeSuccessfulFailed);
		return writeSuccessfulFailed;
	}
	public void ReadTextFile() throws IOException {
		
	   
	    File file = 
	      new File("C:\\Users\\Jordan\\Desktop\\output.txt"); 
	    Scanner sc = new Scanner(file);
	    String sentance = sc.nextLine(); 
	    
	    while (sc.hasNextLine()) {
	        System.out.println(sc.nextLine());

	    	}
		} 
	
	public void executeBat() throws IOException {
		
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "speedtest.bat");
		File dir = new File("C:\\Users\\Jordan\\Desktop");
		pb.directory(dir);
		Process p = pb.start();
	}
	public void createGraphFile() throws IOException{
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Jordan\\Desktop\\output.txt"));
			     BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Jordan\\Desktop\\data.txt"))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			        String[] values = line.split(" ");
			        if (values.length >= 3)
			            bw.write(values[0] + ' ' + values[1] + ' ' + values[2] + '\n');
			    }
		}
	}
}

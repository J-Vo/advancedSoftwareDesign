package speedTestProject;

import java.io.IOException;
import java.nio.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String args[]) throws IOException{ 
		connectivity_test x = new connectivity_test();
		
		x.isConnected();
		
		file_handler file = new file_handler();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String dateTime = formatter.format(date);
		double uploadSpeed = 77;
		double downloadSpeed = 10;
		
		file.createTextFile(dateTime, uploadSpeed, downloadSpeed);
		
		file.ReadTextFile();
    }
}

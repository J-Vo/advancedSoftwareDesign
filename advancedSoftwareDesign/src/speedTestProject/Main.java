package speedTestProject;

import java.io.IOException;
import java.nio.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.simple.parser.ParseException;
public class Main{
	
	public static void main(String args[]) throws IOException, InterruptedException, JSONException, ParseException{ 
		
		connectivity_test x = new connectivity_test();
	
		x.isConnected();
		  
		file_handler file = new file_handler();
		
		file.executeBat();
		
		file.createGraphFile();
    }
}

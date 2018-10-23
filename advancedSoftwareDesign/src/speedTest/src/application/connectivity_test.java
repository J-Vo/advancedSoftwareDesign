package application;
//Hello
import java.net.URL;
import java.net.URLConnection;

public class connectivity_test {

	public boolean isConnected() 
    { 
        try {
            URL url = new URL("www.google.com");
           
            URLConnection connection = url.openConnection(); 

            connection.connect(); 

            System.out.println("Connection Successful");
            
            return true;
        } 
        catch (Exception e) { 
            
        	System.out.println("Internet Not Connected");
            
            return false;
        } 
    } 
}

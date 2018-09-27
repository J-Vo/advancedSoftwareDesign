package speedTestProject;
//Hello
import java.net.URL;
import java.net.URLConnection;

public class connectivity_test {

	public boolean isConnected() 
    { 
        try {
            URL url = new URL("https://facebook.com");
           
            URLConnection connection = url.openConnection(); 
            
            long lStartTime = System.currentTimeMillis();
            connection.connect(); 
            long lEndTime = System.currentTimeMillis();
            long output = lEndTime - lStartTime;
            System.out.println("Elapsed time in milliseconds: " + output);
            
            System.out.println("Connection Successful");
            
            return true;
        } 
        catch (Exception e) { 
            System.out.println("Internet Not Connected");
            
            return false;
        } 
    } 
}

package speedTestProject;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.NoSuchElementException;
import java.util.Scanner;
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
		
		Path file = Paths.get("speedTest.txt");
		System.out.println();
		System.out.println(Files.readAllLines(file));
		
		
		
	}
}

import java.nio.file.*;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get("C:\\Users\\ADMÝN\\Desktop\\Java Workspace\\ReadFromText\\src"))); 
		System.out.print(data);
	}

}
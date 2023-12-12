package in.com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteDataLineByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\ASUS\\Desktop\\Rahul\\Rahul.txt");
		
		PrintWriter pw = new PrintWriter(file);
		
		for (int i = 0; i < 5; i++) {
			pw.println(i + "SitaRam");
		}
		pw.close();
		file.close();
		
	}

}

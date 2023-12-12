package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadByLine {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\ASUS\\Desktop\\Rahul\\Core.txt");
		
		BufferedReader out = new BufferedReader(file);// read line by line
		
		String line = out.readLine(); //reads a character
		
		while (line != null) { // -1 is end of file
		
			System.out.println(line);	
			
		line = out.readLine();
			
		}
		
		out.close();
		
	}

}

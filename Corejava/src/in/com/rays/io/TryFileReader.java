package in.com.rays.io;

import java.io.FileReader;

public class TryFileReader {

	public static void main(String[] args) {
		
		try {
			
			FileReader file = new FileReader("C:\\Users\\ASUS\\Desktop\\Rahul\\Core.txt");
			
			int ch =file.read();
			
			while (ch != -1) {
				
				System.out.print((char)ch);
				ch = file.read();
				
				
			}
			
			file.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		
		
		
	}
	
}

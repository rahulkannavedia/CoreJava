package in.com.rays.io;

import java.io.FileReader;

public class ReadByChar {
	public static void main(String[] args) throws Exception {
		
	  FileReader file = new FileReader("C:\\Users\\ASUS\\Desktop\\Rahul\\Core.txt");
		
	  int ch = file.read(); // read char by char
	  
	  while (ch != -1) {
		
		  System.out.println((char)ch);       //((char)ch);Reading Character      //(ch);Reading Number             
		  ch = file.read();		  
		  
	}
	  file.close();
	}

}

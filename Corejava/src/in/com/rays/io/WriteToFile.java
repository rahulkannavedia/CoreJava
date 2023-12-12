package in.com.rays.io;

import java.io.FileWriter;

public class WriteToFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\ASUS\\Desktop\\Rahul\\Rahul1.txt");
		
		file.write('A');
		file.write('\n');
		file.write("this is line one");
		file.write("this is line two");
		file.close();
		
		System.out.println("check C:\\Users\\ASUS\\Desktop\\Rahul\\Rahul1.txt");

   
	}
}
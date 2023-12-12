package in.com.rays.io;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\ASUS\\Desktop\\Rahul\\Core.txt");
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			
			System.out.println(sc.nextLine());
			
		}
		
		file.close();
		
	}

}

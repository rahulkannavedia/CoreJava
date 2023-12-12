package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyboard {
	public static void main(String[] args) throws Exception {
		
		InputStreamReader inReader = new InputStreamReader(System.in);
	
		BufferedReader br = new BufferedReader(inReader);
		
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\Rahul\\Keyboard.txt",true));
		
		String line = br.readLine();
		
		while (!line.equals("bye")) {
		
			pw.println(line);
			
			line = br.readLine();
			
			
		}
		br.close();
		pw.close();
	}

}

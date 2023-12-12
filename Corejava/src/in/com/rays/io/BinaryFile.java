package in.com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFile {
public static void main(String[] args) throws Exception {
	
	FileInputStream in = new FileInputStream("C:\\Users\\ASUS\\Desktop\\CorePic\\pic.jpg");
	
	FileOutputStream out = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Rahul\\pic.jpg");
	
	int ch = in.read();
	
	while(ch!=-1) {
		out.write(ch);
		
		System.out.print((char)ch);
		ch=in.read();
	}
	out.close();
	in.close();
}
}

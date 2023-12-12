package in.com.rays.io;

import java.io.File;
import java.util.Date;

public class ReadFileAttributes {
	
	public static void main(String[] args) {
	
		File f = new File("C:\\Users\\ASUS\\Desktop\\Rahul\\Core.txt");
		if (f.exists()) {
		
			System.out.println("name =" +f.getName());
			System.out.println("absolute =" +f.getAbsolutePath());
			System.out.println("is Writable =" +f.canWrite());
			System.out.println("is readable =" +f.canRead());
			System.out.println("is file =" +f.isFile());
			System.out.println("is directory =" +f.isDirectory());
			System.out.println("last modified at" +new Date(f.lastModified()));
			System.out.println("size =" +f.length());
			
			
			
			
		}
		
	}

}

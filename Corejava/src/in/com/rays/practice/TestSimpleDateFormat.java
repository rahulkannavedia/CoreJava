package in.com.rays.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
public static void main(String[] args) {
	
	Date d =  new Date();
	
			System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
	
	String s = sdf.format(d);
	
	System.out.println(s);
	
}	
	

}

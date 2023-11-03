package in.com.rays.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleStringDate {
	
	public static void main(String[] args) throws ParseException {
		
		String s = "10/01/2020";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(s);
		
		System.out.println(d);
		
		
		
		
		
		
	}

}

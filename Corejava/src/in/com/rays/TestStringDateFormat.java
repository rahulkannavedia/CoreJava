package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringDateFormat {
public static void main(String[] args) throws ParseException {
	
	String s = "11/10/2023";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	Date d = sdf.parse(s);
	System.out.println(d);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

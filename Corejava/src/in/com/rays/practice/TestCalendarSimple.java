package in.com.rays.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarSimple {
public static void main(String[] args) throws ParseException {
	
	String s = "01/07/2024"; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d = sdf.parse(s);
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	for (int i = 1; i <= 3; i++) {
		
		cal.add(Calendar.DATE , 10);
		
		System.out.println(sdf.format(cal.getTime()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

}

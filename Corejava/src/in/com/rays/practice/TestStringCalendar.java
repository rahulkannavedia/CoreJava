package in.com.rays.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestStringCalendar {
public static void main(String[] args) throws ParseException {
	
	String s =" 11/10/2023";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d = sdf.parse(s);
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	cal.add(Calendar.DATE, 5);
	
	System.out.println(sdf.format(cal.getTime()));
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

}

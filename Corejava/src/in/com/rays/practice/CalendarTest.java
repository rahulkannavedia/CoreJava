package in.com.rays.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
public static void main(String[] args) throws ParseException {
	
	String s = "01/07/2002";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d = sdf.parse(s);
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	cal.add(Calendar.DATE,1);
	
	System.out.println(sdf.format(cal.getTime()));
}
}

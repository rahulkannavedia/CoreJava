package in.com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
public static void main(String[] args) throws ParseException {
	
	String s = "10/10/2022";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d = sdf.parse(s);
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	cal.add(Calendar.DATE, +1);
	
	System.out.println(sdf.format(cal.getTime()));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

}

package in.com.rays.date;

import java.util.Calendar;
import java.util.Date;

public class TestStringCalendar {
public static void main(String[] args) {
	
	Date d = new Date();
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	cal.add(Calendar.DATE,-30);
	
	System.out.println(cal.getTime());
}	
	

}

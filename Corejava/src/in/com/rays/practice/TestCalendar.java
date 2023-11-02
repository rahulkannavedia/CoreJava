package in.com.rays.practice;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
public static void main(String[] args) {
	
	Date d = new Date();
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	
	cal.add(Calendar.DATE,+10);
	
	System.out.println(cal.getTime());	
	
}
}

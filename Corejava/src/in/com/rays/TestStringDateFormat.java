package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringDateFormat {
public static void main(String[] args) throws ParseException {
	
	String s = "01/07/2002";
	
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    Date d = sdf.parse(s);
    
   System.out.println(d);

    
}

}

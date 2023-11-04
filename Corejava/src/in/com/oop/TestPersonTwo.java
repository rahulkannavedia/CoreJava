package in.com.oop;

import java.util.Date;

public class TestPersonTwo {
public static void main(String[] args) {
	
	  PersonTwo p = new PersonTwo();
	 
	  p.setName("rahul");
	  p.setDate(new Date());
	  p.setAddress("indore");
	  
	  System.out.println(p.getName());
	  System.out.println(p.getDob());
	  System.out.println(p.getAddress());
	  System.out.println(PersonTwo.AVG_AGE);
	
}
}

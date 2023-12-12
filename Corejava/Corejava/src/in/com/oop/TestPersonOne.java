package in.com.oop;

public class TestPersonOne {
public static void main(String[] args) {
	
	    PersonOne p = new PersonOne();
	    
	    p.setId(100);
		p.setFirstName("abc");
		p.setLastName("xyz");
		
		System.out.println(p.getId());
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(PersonOne.AVG_AGE);
}	

}

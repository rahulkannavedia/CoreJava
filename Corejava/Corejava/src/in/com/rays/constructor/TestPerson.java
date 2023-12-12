package in.com.rays.constructor;

public class TestPerson {
public static void main(String[] args) {
		
	Person p1 = new Person();
	
	Person p2 = new Person(100, "rahul", "kannavedia");
	
	System.out.println(p2.getId());
	System.out.println(p2.getFirstName());
	System.out.println(p2.getLastName());
	
	}


}

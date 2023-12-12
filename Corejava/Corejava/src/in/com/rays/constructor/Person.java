package in.com.rays.constructor;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	public static final int AVG_AGE = 15; 
	
	public Person() {
		System.out.println("default constructor");
	}
	
	public Person(int id, String firstName, String lastName ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
     
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}

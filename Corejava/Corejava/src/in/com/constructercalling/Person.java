package in.com.constructercalling;

public class Person {

	private String firstName;
	private String lastName;
	private String address;
	
	public Person() {
		System.out.println("Person Default Constructer");
	}
	
	public Person(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Person 1 parameter constructer");
	}
	
	public Person(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		System.out.println("Person 2 parameter constructer");	
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
	
	public void setAdderess(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
		
	}
	
	
}

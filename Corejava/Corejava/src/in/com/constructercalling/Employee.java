 package in.com.constructercalling;

public class Employee extends Person {
	
	private String designation;
	
    public Employee() {
    	System.out.println("Employee Default Constructer"); 	
    }
    
    public Employee(String firstName, String lastName, String designation) {
    	super(firstName, lastName);
    	this.designation = designation;
    	System.out.println("Employee 1 parameter Constructer");  	
    }
    
    public void setDesignation(String designation) {
    	this.designation = designation;
    }
    
    public String getDesignation() {
		return designation;  	
    }

    
    
    
}

package in.com.oop;

import java.util.Date;

public class PersonTwo {
	
	private String name;
    private Date dob;
    private String address;
    public static final int AVG_AGE = 20;
    
    public void setName(String name) {
    	this.name = name;
    }
	
    public String getName() {
		return name;
    }
    
    public void setDate(Date dob) {
    	this.dob = dob;
    }
    
    public Date getDob() {
    	return dob;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String getAddress() {
		return address;
    	
    }
    
}

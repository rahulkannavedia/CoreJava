package in.com.cloning;

public class Customer {
	
    public String name = null;
    public Account account = null;
    
    public Customer(String name) {
    	this.name = name;
    	this.account = new Account(100);
    }
    
     
}

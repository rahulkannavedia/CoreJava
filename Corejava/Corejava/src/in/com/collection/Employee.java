package in.com.collection;

public class Employee {

	private int id;
	private String name;
	private int salary;
	
	public Employee (int id,String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}  
	
	@Override
	public int hashCode() {          //hashcode or equals  object ki method hai 
	    String str = id + name + salary;   //hashcode memory address batata hai
		return str.hashCode();                
	}
	
	@Override
	public boolean equals(Object obj) {  //equals ka return type boolean hai.. 
		
		Employee e = (Employee) obj;
		
		boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;
		
		return b ;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
	
	
	
}

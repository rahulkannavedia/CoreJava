package in.com.constructercalling;

public class TestConstructer {

	public static void main(String[] args) {
		Employee e = new Employee("abc" , "xyz" ,"***");
	 
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getDesignation());
	
}
}
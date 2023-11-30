package in.com.exception;

public class TestIndexOutOfBound {
public static void main(String[] args) {
		
		try {
			String [] names = {"abc"};
			
			String name = "abc";
			
			System.out.println(names[0] );
			
			System.out.println(name.charAt(5));
		} catch (Exception e) {
			System.out.println(e);
	
			//StringIndexOutOfBoundsException: String index out of range: 5
		}
		
	}


}

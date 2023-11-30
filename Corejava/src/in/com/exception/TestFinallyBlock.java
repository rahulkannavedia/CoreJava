package in.com.exception;

public class TestFinallyBlock { 

	public static void main(String[] args) {
		
		int a = 10; 
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("Division =" +c);
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
//			System.exit(1); // to terminate the flow of code ot or break the code
		} 
		
		finally {
			System.out.println("Finally Block.......!!!!");
		}
		
		System.out.println("After");
	}

}

package in.com.exception;

public class TestMultipleException {
	public static void main(String[] args) {
		
		try {
			String name = "abc";
			System.out.println(name.length());
			System.out.println(name.charAt(5));
		    int a = 10;
		    int b = 0;
		    int c = a/b;
		    System.out.println("Division ="+c);
			
		} 
		catch (ArithmeticException e) {
		  System.out.println("Arithmetic Exception");
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception ");			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("After Try Catch");
		
		
	}
	
}

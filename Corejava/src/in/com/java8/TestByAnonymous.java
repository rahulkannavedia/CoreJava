package in.com.java8;

public class TestByAnonymous {
	
	public static void main(String[] args) {
		
		Hello h = new Hello() {
			
			@Override
			public void say() {
				System.out.println("Functional Interface By Anonymous Function");
				
			}
		};
		
		h.say();
		
	}

}

package in.com.java8;

public class TestDefaultStatic {
	
	public static void main(String[] args) {
		
		DefaultStaticInterface ds = new DefaultStaticInterface() {
			
			@Override
			public void abstractMethod() {
			
				System.out.println("Abstract Method....!!!");
				
			}
		};
		
		ds.abstractMethod();
		ds.defaultMethod();
		
		DefaultStaticInterface.staticMethod();
		
	}
	
}

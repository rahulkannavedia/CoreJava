package in.com.java8;

@FunctionalInterface
public interface DefaultStaticInterface {
	
	public void abstractMethod();
	
	public default void defaultMethod() {
		
		System.out.println("Default Method....!!!");
		
	}
	
	public static void staticMethod() {
		
		System.out.println("Static Method....!!!");
		
	}
	

}

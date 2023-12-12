package in.com.thread;

public class TestWithoutThread {
public static void main(String[] args) {
	
	WithoutThread t1 = new WithoutThread("Siya");
	WithoutThread t2 = new WithoutThread("Ram");
	
	t1.run();
	t2.run();

}	
	

}

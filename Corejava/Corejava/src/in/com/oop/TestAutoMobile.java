package in.com.oop;

public class TestAutoMobile {
public static void main(String[] args) {
		
	AutoMobile a = new AutoMobile();
	
	a.setColor("Red");
	a.setSpeed(100);
	a.setMake("XUV");
	
	System.out.println(a.getColor());
	System.out.println(a.getSpeed());
	System.out.println(a.getMake());
	System.out.println(AutoMobile.NO_OF_GEARS);
	
	
	}

}

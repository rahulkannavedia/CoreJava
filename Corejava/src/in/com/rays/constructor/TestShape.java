package in.com.rays.constructor;

public class TestShape {
	public static void main(String[] args) {
	
		Shape s1 = new Shape();
		
		Shape s2 = new Shape("Red",10);
		
		System.out.println(s2.getColour());
		System.out.println(s2.getborderWidth());
		
	}

}

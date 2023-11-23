package in.com.rays.obj;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.Area();

		
		Rectangle r = new Rectangle();
        r.Area();
       

		Shape sh= new Rectangle();
		sh.Area();
//		this method is called override method.
		

		Rectangle rectangle = (Rectangle) sh;
		rectangle.Area();
		
//		This is called typecaste.   

	}

}
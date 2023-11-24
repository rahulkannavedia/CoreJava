package in.com.gettersetter;

public class TestShape {
public static void main(String[] args) {

	Shape s = new Shape();	
	s.setColor("Red");
	s.setBorderWidth(10);
 
	Rectangle r = new Rectangle();
	r.setColor("Blue");
	r.setBorderWidth(20);
	r.setLength(10);
	r.setWidth(20);
	r.area();
	
	Circle c = new Circle();
	c.setColor("Pink");
	c.setBorderWidth(10);
	c.setRadius(20);
	c.area();
	
	Triangle t = new Triangle();
	
	t.setColor("Purple");
	t.setBorderWidth(10);
	t.setBase(10);
	t.setHeight(10);
	t.area();
	
	System.out.println("Shape====>>>>");
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
	
	System.out.println("Rectangle====>>>>");
	System.out.println(r.getColor());
	System.out.println(r.getBorderWidth());
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	
	System.out.println("Circle====>>>>");
	System.out.println(c.getColor());
	System.out.println(c.getBorderWidth());
	System.out.println(c.getRadius());
	
	System.out.println("Triangle====>>>>");
	System.out.println(t.getColor());
	System.out.println(t.getBorderWidth());
	System.out.println(	t.getBase());
	System.out.println(t.getHeight());



}

}
package in.com.rays.inheritance;

public class Rectangle extends Shape {

	private int length;
	private int Width;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int Width) {
		this.Width = Width;
	}
	
	public int getWidth() {
		return Width;
	}
	
	public void area() {
		int rArea = getLength() * getWidth();
		System.out.println("Rectangle area =" + rArea);
	}
	
	
}

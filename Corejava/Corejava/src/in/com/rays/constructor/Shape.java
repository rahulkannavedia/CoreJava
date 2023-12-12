package in.com.rays.constructor;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public Shape() {
		System.out.println("defult constructor");
	}
	
	public Shape(String color,int borderWidth ) {
		this.color = color;
		this.borderWidth = borderWidth;
	}
	
	public void setColour(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setborderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public int getborderWidth() {
		return borderWidth;
	}
	
}

package in.com.rays.constructor;

public class Shape {
	
	private String colour;
	private int borderWidth;
	
	public Shape() {
		System.out.println("defult constructor");
	}
	
	public Shape(String colour,int borderWidth ) {
		this.colour = colour;
		this.borderWidth = borderWidth;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setborderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public int getborderWidth() {
		return borderWidth;
	}
	
}

package in.com.rays.inheritance;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(int boarderWidth) {
		this.borderWidth = boarderWidth;
	}
	
	public int getBoarderWidth() {
		return borderWidth;		
	}
	
	public void area() {
		System.out.println("Shape Area Meethod");
	}
	

}

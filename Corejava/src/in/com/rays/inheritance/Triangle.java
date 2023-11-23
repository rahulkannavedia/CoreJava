package in.com.rays.inheritance;

public class Triangle extends Shape {

	private int base;
	private int heigth;
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setHeigth(int heigth) {
		this.heigth  = heigth;
	}
	
	public int getHeigth() {
		return heigth;
	}
	
	public void area() {
		int tArea = (getBase() * getHeigth()) / 2;
		System.out.println("Triangle area =" +tArea);
	}
	
	
	
}

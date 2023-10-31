package in.com.rays.practice;

public class Random {
public static void main(String[] args) {
	int min = 100;
	int max = 1;
	int range = min-max;
	
	for (int i = 1; i < 5; i++) {
		
	int rd = (int)(Math.random()*range);
	
	System.out.println(rd);
	}
}
	
}

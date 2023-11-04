package in.com.rays.practice;

public class TestRandom {
	public static void main(String[] args) {
		
	
	int max = 100;
	int min = 1;
    int range = max-min;
    
    for (int i = 0; i < 5; i++) {
		
    	int rd = (int)(Math.random()*range);
    	
    	System.out.println(rd);
    	
	}
    
	}   

}

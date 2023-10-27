package in.com.rays;

public class Test2ArmstrongNumber {

	public static void main(String[] args) {
		
		int a=271;
		int b=0;
		int c;
		int d=a;
		
		while (d>0) {
			
			c=d%10;
			b=b+(c*c*c);
			d=d/10;
			
			}
		
		if(b==b) {
			
			System.out.println("yes");
		
		} 
		else {
			System.out.println("no");
		}
	}
	
}

package in.com.rays;

public class TestArmstrongNumber {

	public static void main(String[]arg) {
		
		int a = 370;
		int b = 0;
		int c;
		int d=a;
		
		while (d>0) {
			
			c=d%10;
			b=b+(c*c*c);
			d=d/10;
		}
			
		if (b==a) {
			
			System.out.println("yes");
			
		}
		
		else {
			System.out.println("no");
		}
	}
}

package in.com.rays;

public class TestPrimeNumber {

	public static void main(String[] args) {
		
		int num = 53;
		int count = 0;
		
		
		for(int i = 2; i < num; i++) {
			
			if(num%i==0) {
				
				count=1;
				
			}
			
		}
		
		if(count==0) {
			System.out.println("yes prime");
		}else {
			System.out.println("not prime");
	}
	}
}

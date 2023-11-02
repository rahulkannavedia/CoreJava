package in.com.rays.practice;

public class Division {
public static void main(String[] args) {
	
	int a = 9;
	int sum = 0;
	int count = 0;
	
	for (int i = 90; i <=100; i++) {
		
		if (i%a==0) {
			
			
			count=i;
			System.out.println(count);
			
			sum=sum+count;
		}
		
	}
	System.out.println("sum" +sum);
	
}
	
}

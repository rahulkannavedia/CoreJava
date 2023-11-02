package in.com.rays.practice;

public class Largest {

	public static void main(String[] args) {
		
		int [] arr = {10,20,5,15,25};
		
		int a = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]>a) {
				
				a=arr[i];
				
				
			}
			
		}System.out.println(a);
		
	}
	
}

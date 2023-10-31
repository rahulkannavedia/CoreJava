package in.com.rays.practice;

public class LargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {100,200,500,400,10};
		int a = 0;
	    
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>a) {
				
				a=arr[i];
				
			}
			
		}System.out.println(a);
	}

}

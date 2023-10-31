package in.com.rays.practice;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
	
	int[] arr = {100,500,400,10,20};	
		
	int min = 0;
	int max = 0;
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i]>max) {
		    min=max;
			max=arr[i];
			
		}if (min<arr[i]&&max>arr[i]) {
			min=arr[i];
		}
	}
	
	System.out.println("second largest" +min);
		
	}

}

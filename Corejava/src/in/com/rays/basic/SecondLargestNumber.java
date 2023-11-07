package in.com.rays.basic;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int[]arr= {1200,500,1000,200,100,1200,2500,3000};
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++)
		
		{
			 if (arr[i]>max) {
				min = max;
				max = arr[i];
			}
			 
			 if (min<arr[i] && max>arr[i]){
				min = arr[i];
				
			}
			 
		}
		System.out.println("Second Largest ="+ min);
		
		
	}
	

}

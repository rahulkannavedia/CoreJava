package in.com.rays;

public class Largestarryinteger {
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,400,100,29,677};
		
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>a) {
				
				a=arr[i];
			}
				
			}
		
		System.out.println(a);
			
		}

}

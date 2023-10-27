package in.com.rays;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1200,1000,5, 15,25,50,45,};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
for (int j = i+1; j < arr.length; j++) {

	if (arr[i]>arr[j]) {
		temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
		
	}
}	
      System.out.println(arr[i]);
		}
	}
}

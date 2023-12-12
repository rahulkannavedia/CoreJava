package in.com.rays.basic;

public class Q18 {

	public static void main(String[] args) {
		int[] arr = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		int target = 90;
		
		int position = findPosition(target, arr);
		int index = position - 1;
		if (position != -1) {
			System.out.println(
			"The integer " + target + " is found at position " + position + " and index is : " + index);
	
		} else {
			System.out.println("The integer " + target + " is not found in the array.");
		}
	}

	private static int findPosition(int target, int[] arr) {
		int value = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == target) {
				value = i + 1;
			}
		}
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	// Normally also we can do it and to learn how to use a function we can go through above method
	

//	int position = 0;
//	int index = 0;
//	for (int i = 0; i <= arr.length - 1; i++) {
//		if (arr[i] == target) {
//			position = i + 1;
//			index = i;
//		}
//	}
	
}

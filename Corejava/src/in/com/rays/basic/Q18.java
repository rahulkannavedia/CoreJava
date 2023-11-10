package in.com.rays.basic;

public class Q18 {

	 public static void main(String[] args) {
	        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
	        int target = 90;

	        int position = findPosition(target, arr);

	        if (position != -1) {
	            System.out.println("The integer " + target + " is found at position " + position);
	        } else {
	            System.out.println("The integer " + target + " is not found in the array.");
	        }
	    }

	private static int findPosition(int target, int[] arr) {
		return 0;
	}
	}

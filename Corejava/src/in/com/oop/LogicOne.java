package in.com.oop;

public class LogicOne {

	public static void sum(int a, int b) {

		int c = a + b;

		System.out.println("sum = " + c);

	}

	public void isArmstrong(int number) {

		int a=0;
		int b=0;
		int c;
		int d=a;

		while (d>0) {
			c=d % 10;
			b=b+(c*c*c);
			d=d/10;
		}

		if (b==a) {
			System.out.println("Armstrong Number...!!!");
		} else {
			System.out.println("Not Armstrong Number...!!!");
		}
	}

	public void secondLarget(int[] arr) {

		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				min = max;
				max = arr[i];
			}
			if (min < arr[i] && max > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Second Largest = " + min);
	}

	public void noteCount(int amount) {

		int count = 0;

		int[] notes = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < notes.length; i++) {

			count = amount / notes[i];

			amount = amount % notes[i];

			if (count > 0) {

				System.out.println(notes[i] + " = " + count);

			}

		}

	}

}

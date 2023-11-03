package in.com.rays;

public class NoteCountArray {

	public static void main(String[] args) {
		int number = 55555;
		int count = 0;
		int[] notes = {2000,1000,500,100,50,5,1};
		for (int i = 0; i < notes.length; i++) {
			count = number / notes[i];
			number = number % notes[i];
			if (count > 0) {
				
				System.out.println(notes[i]+"="+count);
				
			}
		}
			
	}
}

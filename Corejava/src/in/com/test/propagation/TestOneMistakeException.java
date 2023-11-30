package in.com.test.propagation;

public class TestOneMistakeException {

	public static void main(String[] args) {
		try {
			dad();
		} catch (OneMistakeException e) {
			e.printStackTrace();
		}
	} 
	
	public static void dad() throws OneMistakeException {
		mom();
	}
	
	public static void mom() throws OneMistakeException {
		son();
	}
	
	public static void son() throws OneMistakeException{
		throw new OneMistakeException();
	}
	
}

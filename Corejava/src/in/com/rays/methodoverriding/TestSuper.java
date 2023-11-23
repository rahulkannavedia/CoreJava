package in.com.rays.methodoverriding;

public class TestSuper {
	
	public static void main(String[] args) {
		
		Super s = new Super();
		s.Area();
		
		Sub sb = new Sub();
		sb.Area();
		
		Super su = new Sub();
		su.Area();
		
		
		
	}

}

package in.com.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		
		Enumeration e = v.elements();
		v.add(40);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		
	}

}

package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestOneCollection {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(1);
		c1.add(2);
//		c1.add(3);
//		c1.add(4);
//		c1.add(5);
//		c1.add("a");
//		c1.add("b");
		
		Collection c2 = new ArrayList();
		
//		c2.add("a");
//		c2.add("b");
//		c2.add("c");
//		c2.add("d");
//		c2.add("e");
		c2.add(1);
		c2.add(2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		

		
		System.out.println(c1.contains(1));
		
		
		
		
		
	}

}

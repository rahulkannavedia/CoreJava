package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add('a');
		
		Collection c2 = new ArrayList();
		
		c2.add('a');
		c2.add('b');
		c2.add('c');
		c2.add('d');
		c2.add('e');
		c2.add('f');
		
		System.out.println("c1 =>" +c1);
		System.out.println("c2 =>" +c2);
		
//		c1.retainAll(c2);
		
		System.out.println("c1 =>" +c1);
		System.out.println("c2 =>" +c2);
		
		
		
		
	}

}

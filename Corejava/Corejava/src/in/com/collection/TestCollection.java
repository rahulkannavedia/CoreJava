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
		c2.add(4);
		c2.add(5);
		
		System.out.println("c1 =>" +c1);
		System.out.println("c2 =>" +c2);
		
//		c1.retainAll(c2);
//		System.out.println("retainAll =>" +c1);
//		System.out.println("retainAll =>" +c2);
//		
//		c1.add(c2);                    //Add a new element.
//		System.out.println("add =>" +c1);
//		System.out.println("add =>" +c2);
//		
//		c1.addAll(c2);                 //Add a collection.
//		System.out.println("addAll =>" +c1);
//		System.out.println("addAll =>" +c2);
//		
//		c1.clear();                    //Remove all element.
//		System.out.println("clear =>"+c1);
//		System.out.println("clear =>"+c2);
//		
//		                                      
//		System.out.println(c1.contains(1));//Membership checking. //contains ek obj ko check karega
//		System.out.println("contains =>" +c2);
//		
//		System.out.println(c1.containsAll(c2));//Inclusion checking.  //containsAll collection ko check karega
//		System.out.println("containsAll =>" +c2);
		
//		c1.isEmpty();                //whether it is empty.
//		System.out.println("isEmpty =>" +c1);
//		System.out.println("isEmpty =>" +c2);
//		
//		
//		c1.remove(c2);              //Remove an element.
//		System.out.println("remove =>" +c1);
//		System.out.println("remove =>" +c2);
//		
//      c1.removeAll(c2);              //Remove a collection.
//		System.out.println("removeAll =>" +c1);
//		System.out.println("removeAll =>" +c2);
//		
		                    
		System.out.println(c1.size()); //The number of element.
		System.out.println("size =>" +c2);
		
		
		
	}

}

package in.com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSetCollection {
	
	public static void main(String[] args) {
	
		Set set = new HashSet();
		
		set.add(200);
		set.add(100);
	    set.add("abc");
	    set.add("xyz");
		set.add(100);   //set can't hold duplicate varibale.
	    set.add("abc");
	    
	    System.out.println(set);
	  
//	    for (int i = 0; i < set.size(); i++) {
//		     System.out.println(set);
//	}
	    
 	}

}

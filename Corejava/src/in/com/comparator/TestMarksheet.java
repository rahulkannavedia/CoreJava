package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Marksheet(2, "rahu", 10));
		list.add(new Marksheet(1, "rahu", 40));
		list.add(new Marksheet(4, "aman", 10));
		list.add(new Marksheet(3, "gyan", 20));
			
		Collections.sort(list,new OrderByNameDesc());
		for (Object object : list) {
			System.out.println(object);
		}
	}

}

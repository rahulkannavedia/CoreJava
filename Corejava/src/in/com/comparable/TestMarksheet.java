package in.com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.com.comparator.OrderByNameDesc;

public class TestMarksheet {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Marksheet(2, "rahu", 1000));
		list.add(new Marksheet(1, "siya", 2000));
		list.add(new Marksheet(4, "aman", 3000));
		list.add(new Marksheet(3, "gyan", 4000));
			
		Collections.sort(list,new OrderByNameDesc());
		for (Object object : list) {
			System.out.println(object);
		}
	}

}

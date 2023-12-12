package in.com.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {
	
	public static void main(String[] args) {
		
		List<Contestent> list = new ArrayList<Contestent>();
	
		list.add(new Contestent("Rahul",  "7247298670"));
		list.add(new Contestent("Siya",  "72472986"));
		list.add(new Contestent("Ram",  "72472986"));
		list.add(new Contestent("Radhe",  "7247298670"));
		list.add(new Contestent("shyam",  "7247298674"));
		list.add(new Contestent("Gourav", "7247298675"));
		list.add(new Contestent("Satyam",  "7247298676"));
		list.add(new Contestent("Shubham",  "7247298677"));
		list.add(new Contestent("Shalin",  "7247298678"));
		list.add(new Contestent("Aman", "72472986779"));
		
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			Collections.shuffle(e);
			return e.stream();})).limit(3).forEach(e -> {
				System.out.println(e);
			});
	}
		
}
	



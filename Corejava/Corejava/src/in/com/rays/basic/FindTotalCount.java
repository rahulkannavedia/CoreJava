package in.com.rays.basic;

public class FindTotalCount {
	
		public static void main(String[] args) {
	
			String name = "Rahul Kannavedia";
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i)== 'n') {
						count++;
				}
			}
				System.out.println("count = "+ count);
				
					
	}
}
package in.com.unchecked;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name = "Admin";
		if (name.equals("Admin")) {			
			System.out.println("User Is Valid");		
		}
	else {
		
		LoginException l = new LoginException();
		System.out.println(l.getMessage());
//			try {
//				throw new LoginException();
//				
//			} catch (LoginException e) {
//				System.out.println(e.getMessage());
//			}
//		try catch is optinal.
		}
	}

}

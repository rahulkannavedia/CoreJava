package in.com.unchecked;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name = "Admin";
		if (name.equals("Admi")) {			
			System.out.println("User Is Valid");		
		}
		else {
			try {
				throw new LoginException();
				
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

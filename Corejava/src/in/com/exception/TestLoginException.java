package in.com.exception;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name = "admin";
//		String names = "admi";    
//		mes. print user invalid
		
	 	if (name.equals("admi")) {
			System.out.println("User Is Valid.....!!!!");
		}else {
			try {
				throw new LoginException();
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}

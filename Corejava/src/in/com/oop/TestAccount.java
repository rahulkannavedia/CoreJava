package in.com.oop;

public class TestAccount {
public static void main(String[] args) {
	
	Account a = new Account();
	
	a.setNumber("1002");
	a.setDouble(185.20);
	a.setAccountType("current");

	System.out.println(a.getNumber());
	System.out.println(a.getBalance());
	System.out.println(a.getAccountType());
    System.out.println(a.getAccountInfo());
	
}
}

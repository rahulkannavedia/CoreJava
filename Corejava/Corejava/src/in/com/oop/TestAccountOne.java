package in.com.oop;

public class TestAccountOne {
public static void main(String[] args) {
	
	AccountOne acc = new AccountOne();
	
	acc.setBalance(10000);
	acc.deposit(500);
	acc.withdrawl(200);
	
	System.out.println(acc.getBalance());
	
}	

}

package in.com.oop;

public class AccountOne {
	
	private int balance;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		
        setBalance(getBalance() + amount);
		
        System.out.println("balance after deposit = " +amount);
	}
	
	public void withdrawl(int amount) {
		
		int total = getBalance() - amount;
		
		if  (total < 2000) {
			
			System.out.println("Low balance");
		}
		else {
			setBalance(total);
			System.out.println("balance after deposit = " +getBalance());
		}
	}
	
}

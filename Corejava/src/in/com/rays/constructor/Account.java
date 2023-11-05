package in.com.rays.constructor;

public class Account {
	
	private String number;
	private String accountType;
	private int balance;
	
	public Account() {
		System.out.println("defult constructor");
	}
	
	public  Account(String number, String accountType, int balance ) {
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int setBalance() {
		return balance;
	}
	
	public void Withdrawal(int amount) {
		   balance -= amount;
	}
	
	public void Deposit(int amount) {
		   balance += amount;
	}

	public String getAccountInfo() {
		return "Number:"+number+", Account Type:"+accountType+", Balance:"+balance;
		
	}
	
}

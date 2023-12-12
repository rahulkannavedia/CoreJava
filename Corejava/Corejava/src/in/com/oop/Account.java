package in.com.oop;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	
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
	
	public void setDouble(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
    public String getAccountInfo() {
		return "Number:"+number+", Account Type:"+accountType+", Balance:"+balance;
    }
		
}

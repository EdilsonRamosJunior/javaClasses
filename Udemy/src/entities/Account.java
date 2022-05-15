package entities;

public class Account {
	
	private String name;
	private int accountNumber;
	private double balance;
	
	public Account(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber 
				+ ", Holder: "
				+ name
				+ ", Balance: "
				+ balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	
}

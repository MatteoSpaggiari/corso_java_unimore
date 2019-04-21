package inheritance2;

public abstract class BankAccount {
	
	private double balance;

	public BankAccount() {
		super();
	}

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}
		
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	
	public void transfer(double amount, BankAccount other) {
		this.withdraw(amount);
		other.deposit(amount);
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}

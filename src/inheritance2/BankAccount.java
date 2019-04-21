package inheritance2;

public abstract class BankAccount {
	
	protected double balance;

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
		if(this.getBalance() >= amount) {
			this.withdraw(amount);
			other.deposit(amount);
		} else {
			System.out.println("Non è stato possibile effetuare il trasferimento in quanto la somma da trasferire supera la disponibilità presente sul conto corrente.");
		}
	}

}

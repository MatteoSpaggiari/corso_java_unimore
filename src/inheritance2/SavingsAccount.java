package inheritance2;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(double initialBalance, double interestRate) {
		super(initialBalance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		super.deposit(this.getBalance()*(interestRate/100));
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + super.getBalance() + ", interestRate=" + interestRate + "]";
	}
	

}

package inheritance2;

public class CheckingAccount extends BankAccount {
	
	private static int FREE_TRANSACTIONS = 5;
	private static double TRANSACTION_FEE = 4.5;
	private int transactionCount;
	
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
		this.transactionCount = 0;
	}
	
	public void deposit(double amount) {
		this.transactionCount++;
		super.deposit(amount);
		deductFees();
	}
	
	public void withdraw(double amount) {
		this.transactionCount++;
		super.withdraw(amount);
		deductFees();
	}
	
	private void deductFees() {
		if(this.transactionCount > CheckingAccount.FREE_TRANSACTIONS) {
			this.balance = this.balance - CheckingAccount.TRANSACTION_FEE;
			// Imposto a 0 transactionCount dopo aver chiamato withdraw per evitare di far salire di 1 le transazioni
			this.transactionCount = 0;
		}
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + super.getBalance() + ", transactionCount=" + this.transactionCount + ", FREE_TRANSACTIONS = " + CheckingAccount.FREE_TRANSACTIONS + ", TRANSACTION_FEE " + CheckingAccount.TRANSACTION_FEE + "]";
	}
	
	
}

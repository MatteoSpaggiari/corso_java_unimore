package inheritance2;

public class TestApp {

	public static void main(String[] args) {
		
		CheckingAccount ca1 = new CheckingAccount(2000.00);
		System.out.println(ca1);
		ca1.deposit(1000);
		System.out.println(ca1);
		ca1.deposit(1000);
		System.out.println(ca1);
		ca1.withdraw(1000);
		System.out.println(ca1);
		ca1.deposit(1000);
		System.out.println(ca1);
		ca1.withdraw(1000);
		System.out.println(ca1);
		ca1.deposit(1000);
		System.out.println(ca1);
		
		SavingsAccount sa1 = new SavingsAccount(2000.00, 4);
		System.out.println(sa1);
		sa1.deposit(1000);
		System.out.println(sa1);
		sa1.deposit(1000);
		System.out.println(sa1);
		sa1.addInterest();
		System.out.println(sa1);
		
		ca1.transfer(2000, sa1);
		System.out.println(ca1);
		System.out.println(sa1);
		ca1.transfer(2000, sa1);
		System.out.println(ca1);
		System.out.println(sa1);
		
	}

}

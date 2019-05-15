package methodOverriding;

public class SavingsAccount extends BankAccount{

	double interestIncome;
	
	@Override
	public void info() {
		System.out.println("Bank account information\n");
		System.out.println("Name: " + this.name);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
		System.out.println("Interest Income: " + this.interestIncome);
	}
	
	@Override
	public void transfer(double mount) {
		balance -= mount;
		double fee = mount * 0.2;
		balance -= fee;
	}
}

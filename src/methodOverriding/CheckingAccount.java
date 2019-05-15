package methodOverriding;

public class CheckingAccount extends BankAccount{
	
	@Override
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount * 0.05;
		balance -= fee;
	}
	

}

package methodOverriding;

public class BankAccount {
	
	public double balance;
	public String name;
	public int accountNumber;
	
	public  void transfer(double amount) {
		balance -= amount;
		double fee = amount * 0.1;
		balance -= fee;
		System.out.println(amount + " is transferred successfully with fee: "+fee);
	}
	
	public void deposit(double amount) {
		System.out.println(amount  + " is deposited to account number: "+this.accountNumber);
		balance += amount;
	}
	
	public void info() {
		System.out.println("Bank account information\n");
		System.out.println("Name: " + this.name);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
	}
	
	

}

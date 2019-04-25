package objectCreations;

public class Chase {
	
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.accountNumber = 12334;
		ba1.balance = 4500;
		ba1.holderName = "James Bond";
		ba1.type = "checking";
		ba1.info();
		ba1.deposit(2000000);
		ba1.info();
		ba1.transfer(100000);
		ba1.info();
	}

}

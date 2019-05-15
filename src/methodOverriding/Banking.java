package methodOverriding;

public class Banking {
	
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.name = "Adam";
		sa.balance = 1000;
		sa.interestIncome = 30;
		sa.accountNumber = 234524828;
		sa.transfer(200);
		sa.info();
//		BankAccount ba = new BankAccount();
//		ba.accountNumber = 32442;
//		ba.balance = 3000;
//		ba.name = "James Bond";
//		ba.transfer(600);
//		ba.info();
		
	}

}

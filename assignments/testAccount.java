
public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000);
		
		account.SetAnnualInterestRate(.045);
		
		account.withdraw(account.getBalance(account.balance), 2500);
		account.deposit(account.balance, 3000);
		
		System.out.println("Ballance is: " + account.balance);
		System.out.println("Monthly interest: " + account.getMonthlyInterest(account.getMonthlyInterestRate(account.annualInterestRate), account.balance));
		System.out.println("Date Created: " + account.getdate());
		
	}

}

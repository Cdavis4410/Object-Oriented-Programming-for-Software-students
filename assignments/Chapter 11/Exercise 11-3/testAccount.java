
public class testAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 2000);
		Checking checking = new Checking(200, 9, 2000);
		Savings savings = new Savings(5, 2000);
		
		account.SetAnnualInterestRate(.045);
		checking.SetAnnualInterestRate(.045);
		savings.SetAnnualInterestRate(.045);
		
		account.withdraw(300);
		checking.withdraw(2050);
		savings.withdraw(500);
		System.out.println(account.getBalance());
		System.out.println(checking.getBalance());
		System.out.println(savings.getBalance());
		
		account.deposit(3000);
		
		System.out.println("Balance is: " + account.balance);
		System.out.println("Monthly interest: " + account.getMonthlyInterest(account.getMonthlyInterestRate(account.annualInterestRate), account.balance));
		System.out.println("Date Created: " + account.getdate());
		System.out.println(checking.toString());
		System.out.println(savings.toString());
		
	}

}

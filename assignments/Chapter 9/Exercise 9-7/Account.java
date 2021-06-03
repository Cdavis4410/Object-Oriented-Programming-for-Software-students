import java.util.Date;

public class Account {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;


	java.util.Date date = new java.util.Date();

	Account(){
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		date = new java.util.Date();
	}
	public void SetId(int newid) {
		id = newid;
	}
	public int getId(int id) {
		return id;	
	}
	public double setBalance(double newBalance) {
		return balance = newBalance;
	}
	public double getBalance(double balance) {
		return balance;	
	}
	public void SetAnnualInterestRate(double d) {
		annualInterestRate = d;
	}
	public double getAnnualInterestRate(double annualInterestRate) {
		return annualInterestRate;	
	}
	public Date getdate() {
		java.util.Date date = new java.util.Date();
		return date;	
	}

	public double getMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest(double getMonthlyInterestRate, double balance) {
		return getMonthlyInterestRate * balance;
	}

	public double withdraw(double balance, double number) {
		return setBalance(balance - number);
	}
	public double deposit(double balance, double number) {
		return setBalance(balance + number);
	}

}


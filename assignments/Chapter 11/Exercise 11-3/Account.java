import java.util.Date;

public class Account {
	int id = 0;
	double balance = 100.0;
	double annualInterestRate = 0;


	java.util.Date date = new java.util.Date();

	Account(){
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		date = new java.util.Date();
	}
	public void setId(int newid) {
		id = newid;
	}
	public int getId(int id) {
		return id;	
	}
	public double setBalance(double newBalance) {
		return balance = newBalance;
	}
	public double getBalance() {
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

	public void withdraw(double number) {
		balance -= number;
	}
	public void deposit(double number) {
		balance += number;
	}

}

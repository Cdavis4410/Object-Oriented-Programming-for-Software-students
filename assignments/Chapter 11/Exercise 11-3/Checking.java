
public class Checking extends Account{

	double limit = 0;
	
	Checking(){
	}
	
	Checking(double newLimit, int id, double balance){
		super(id, balance);
		limit = newLimit;
	}
	public double setLimit(double newLimit) {
		return limit = newLimit;
	}
	public double getLimit(double limit) {
		return limit;
	}
	
	public void withdraw(double amount) {
		if(amount > balance + limit) {
			System.out.println("You can't withdraw that amount");
		}
		else {
			balance -= amount; 
		}
	}
	public String toString() {
		return "This is the Checking account, the balance is:" + balance;
	}
	
}

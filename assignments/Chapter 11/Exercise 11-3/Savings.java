
public class Savings extends Account{
	
	Savings(){
	}
	Savings(int id, double balance){
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("That amount is over your balance");
		}
		else {
			balance -= amount;
		}
	}
	public String toString() {
		return "This is the savings account, the balance is: " + balance; 
	}
}

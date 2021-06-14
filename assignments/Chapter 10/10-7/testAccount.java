import java.util.Scanner;
public class testAccount {

	public static void main(String[] args) {

		//Create accounts
		Account[] id = new Account[10];
		for (int i = 0; i < 10; i++) {
			id[i] = new Account(i, 100);
		}
		
		//Enter input
		Scanner input = new Scanner(System.in);

		 
		while (true) {

			System.out.print("Enter an ID: ");
			int userId = input.nextInt();
			
			while (userId > 9) {
				System.out.println("Incorrect id, please try again");
				System.out.print("Enter an ID: ");
				userId = input.nextInt();
			}
			
			System.out.println();
				
			
			if (userId <= 9) {
				int user = 0;
				while (user != 4) {
					//menu
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println();
					System.out.print("Enter an option: ");
					user = input.nextInt();
					System.out.println();
					
					//options
					if (user == 1) {
						System.out.println("Ballance is: " + id[userId].balance);
					}
					if (user == 2) {
						System.out.print("Enter ammount to withdraw: ");
						double withdraw = input.nextDouble();
						id[userId].withdraw(id[userId].getBalance(id[userId].balance), withdraw);
						//id[userId] = id[userId].balance;
						System.out.println("Ballance is: " + id[userId].balance);
						System.out.println();
					}
					if (user == 3) {
						System.out.print("Enter ammount to deposit: ");
						double deposit = input.nextDouble();
						id[userId].deposit(id[userId].balance, deposit);
						System.out.println("Ballance is: " + id[userId].balance);
						System.out.println();
					}
					if (user == 4) {
						break;
					}
				}
			}
		}
	}
}

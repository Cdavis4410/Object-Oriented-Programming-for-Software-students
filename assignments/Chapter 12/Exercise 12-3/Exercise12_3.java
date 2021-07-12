import java.util.Scanner;
public class Exercise12_3 {

	public static void main(String[] args) {
		//generate random integers
		int[] array = new int [100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		// user inputs index
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an index between 1 and 100: ");
		int index = input.nextInt() - 1;

		try {
			System.out.println("Number assigned: " +array[index]);
		}
		catch (Exception ex){
			System.out.println("Your index is out of range");
		}
		
	}

}

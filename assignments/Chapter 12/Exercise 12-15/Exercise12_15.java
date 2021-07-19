import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) throws Exception {
		File file = new File("Exercise 12-15.txt");

		//Check if target file exists
		if (file.exists()) {
			System.out.println("The file exists");
			System.exit(0);
		}
		//create file
		try (PrintWriter output = new PrintWriter(file)){

			for (int i = 0; i < 100; i++) {

				output.print(((int)(Math.random() * 236) + 1));
				output.println(" ");
			}
		}

		ArrayList<Integer> numbers = new ArrayList<>();

		try (Scanner input = new Scanner(file);){
			while (input.hasNext()) {
				numbers.add(input.nextInt());
			}
		}

		Collections.sort(numbers);
		System.out.println(numbers.toString());
		System.out.println();
	}
}



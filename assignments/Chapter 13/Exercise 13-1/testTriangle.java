import java.util.Scanner;
/*Caleb Davis
 * 7/22/2021
 * 
 * Exercise 11-1
 */
public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter side 3: ");
		double side3 = input.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		System.out.print("Enter color: ");
		String color = input.next();
		triangle.setColor(color);
		
		System.out.print("Filled(true or false): ");
		Boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		
		
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Date created: " + triangle.getDateCreated());
		System.out.println("Filled: " + triangle.isFilled());
	}

}

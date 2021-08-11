import java.util.Scanner;
/*Caleb Davis
 * 8/10/2021
 * 
 * Exercise 13-7
 */
public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Triangle[] triangle = new Triangle[5];
		
		triangle[0] = new Triangle(9, 9, 9);
		triangle[1] = new Triangle(4, 2, 9);
		triangle[2] = new Triangle(9, 6, 9);
		triangle[3] = new Triangle(9, 2, 6);
		triangle[4] = new Triangle(2, 9, 5);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Area: " + triangle[i].getArea());
			
			
			if (triangle[i] instanceof Colorable) {
				triangle[i].howToColor();
			}
			
		}
	}
}



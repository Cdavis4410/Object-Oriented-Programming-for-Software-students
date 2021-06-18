
public class Triangle extends GeometricObject{

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {	
	}
	public Triangle(double side1, double side2, double side3) {
		
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea(double side1, double side2, double side3) {
		return (side1 + side2 + side3) / 2;
	}
	public double getPerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
	public String toString(double side1, double side2, double side3){
		return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
	}
}

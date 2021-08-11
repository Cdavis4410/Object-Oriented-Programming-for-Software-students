public class Triangle extends GeometricObject implements Colorable {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {	
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
	public String toString(){
		return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (side1 + side2 + side3) / 2;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all three sides");
	}
}
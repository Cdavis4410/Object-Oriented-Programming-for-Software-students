
public class MyIntegerTest {

	public static void main(String[] args) {
		//call methods
		MyInteger num = new MyInteger(70);
		
		System.out.println(num.isEven());
		System.out.println(num.isOdd());
		System.out.println(num.isPrime());
		System.out.println();
		
		System.out.println(num.isEven(num));
		System.out.println(num.isOdd(num));
		System.out.println(num.isPrime(num));
		System.out.println();
		
		System.out.println(num.isEven(num));
		System.out.println(num.isOdd(num));
		System.out.println(num.isPrime(num));
		System.out.println();
		
		System.out.println(num.equals(num));
		System.out.println(num.equals(num));
		System.out.println();
		
		char[] array = {'1','2','3','6'};
		
		System.out.println(MyInteger.parseInt(array));
		System.out.println(MyInteger.parseInt("2345"));
		
	}

}

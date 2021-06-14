
public class MyInteger {

	int value = 0;
	
	MyInteger(){
	}
	MyInteger(int newValue){
		value = newValue;
	}
	int getValue(int value){
		return value;
	}
	public boolean isEven() {
		boolean flag = false;
		if (value % 2 == 0) {
			flag = true;
		}
		return flag;
	}
	public boolean isOdd() {
		boolean flag = false;
		if (value % 2 == 1) {
			flag = true;
		}
		return flag;
	}
	public boolean isPrime() {
		boolean flag = false;
		for (int i = 2; i <= value; i++) {
			if(value % i == 0) {
			flag = true;
			}
		}
		return flag;
	}
	public static boolean isEven(int value) {
		boolean flag = false;
		if (value % 2 == 0) {
			flag = true;
		}
		return flag;
	}
	public static boolean isOdd(int value) {
		boolean flag = false;
		if (value % 2 == 1) {
			flag = true;
		}
		return flag;
	}
	public static boolean isPrime(int value) {
		boolean flag = false;
		for (int i = 2; i <= value; i++) {
			if(value % i == 0) {
			flag = true;
			}
		}
		return flag;
	}
	public boolean isEven(MyInteger myInt) {
		boolean flag = false;
		if (myInt.value % 2 == 0) {
			flag = true;
		}
		return flag;
	}
	public boolean isOdd(MyInteger myInt) {
		boolean flag = false;
		if (myInt.value % 2 == 1) {
			flag = true;
		}
		return flag;
	}
	public boolean isPrime(MyInteger myInt) {
		boolean flag = false;
		for (int i = 2; i <= value; i++) {
			if(myInt.value % i == 0) {
			flag = true;
			}
		}
		return flag;
	}
	public boolean equals(int value) {
		boolean flag = false;
		if (value == this.value) {
			flag = true;
		}
		return flag;
	}
	public boolean equals(MyInteger myInt) {
		if (myInt.value == this.value) {
			return true;
		}
		return false;
	}
	public static int parseInt(char[] input) {
		int number = 0;
		
		for(int i = 0; i < input.length; i++) {
			
		number = number * 10 + (input[i] - '0');
	
				
		}
		return number;
	}
	public static int parseInt(String integer) {
		int number = Integer.parseInt(integer);
		return number;
	}
	
}

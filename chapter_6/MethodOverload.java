//this program uses the square method to demonstrate method overloading
//method overload refers to 2 or more in a class with the same name, function but different parameter, return type
public class MethodOverload{
	public static void main(String[] args) {
		System.out.println("The square root of 7 is:" + square (7)); //displays an int
		System.out.println("The square root of 7 is: " + square (7.9)); //displays a double
	}

	//square method with int value and return type
	public static int square(int intValue) {
		System.out.println("The square of the int value is: " + intValue);
		return intValue * intValue;
	}

	//square method with double value and return type
	public static double square(double doubleValue) {
		System.out.println("The square of the double value is " + doubleValue);
		return doubleValue * doubleValue;
	}
}
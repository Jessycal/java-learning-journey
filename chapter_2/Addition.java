// this code is about addition of numbers

// import the utility scanner to read inputs from keyboard

import java.util.Scanner;    //imports comes before class declaration
public class Addition {
	//main method execution starts from here:
	public static void main(string[] args) {
		//create an object from the scanner class imported to receive inputs from the keyboard
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int number1 = input.nextInt(); //reads the first input number
        System.out.print("Enter second Number: ");
        int number2 = input.nextInt(); //reads the second input number
        int result = number1 + number2; //adds the number then store in result
        System.out.println("sum is " + result);

	}

}
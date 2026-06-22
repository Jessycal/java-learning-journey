//// Creating and manipulating an Account object

import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);

		// create an Account object and assign it to myAccount
		Account myAccount = new Account ();

		// display initial value of name null
		System.out.printf("initial name is: %s%n%n", myAccount.getName());
		System.out.println("please Enter your Name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println(); //prints nothing

		//display the name stored in the object myAccount
		System.out.println("Name in object Myaccount is: " + myAccount.getName());

		
	}
}
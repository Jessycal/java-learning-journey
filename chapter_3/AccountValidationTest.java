//creating an object out of the AccountValidation class
// Inputting and outputting floating-point numbers with Account objects

import java.util.Scanner;

public class AccountValidationTest {
	public static void main(String[] args) {

		AccountValidation account1 = new AccountValidation ("chioma okeke", 50.00);
		AccountValidation account2 = new AccountValidation ("uche okeke", -7.80);
		AccountValidation account3 = new AccountValidation ("Jessy jes", 34.80);
		AccountValidation account4 = new AccountValidation ("May okeke", -9.80);



		//display initial balance of each object
		initialAccountBalance(account1);
		initialAccountBalance(account2);
		initialAccountBalance(account3);
		initialAccountBalance(account4);

		//create a scanner object to receive input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit Amount:");
		double depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);

		account1.deposit(depositAmount);

		//display balances

      
      displayAccountBalance(account1);
      displayAccountBalance(account2);
      displayAccountBalance(account3);
      displayAccountBalance(account4);

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 


	}

	public static void initialAccountBalance(AccountValidation accountBalance) {

		System.out.printf("%s balance: $%.2f%n", accountBalance.getName(), accountBalance.getBalance());

	}

	public static void displayAccountBalance(AccountValidation balance) {
		System.out.printf("%s balance: $%.2f%n",
         balance.getName(), balance.getBalance());
	}
}
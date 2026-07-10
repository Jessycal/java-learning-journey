//this program is about variable scope and shadowing
//shows what happens when a local variable and field variable bears same name 

public class Scope {

	private static  int x = 1; //a field that is accesible to all methods in this class

	//method main creates the local variable x and calls the methods useLocalVariable() useFieldVariable()

	public static void main(String[] args) {
		int x = 5; //method main variable x shadows field variable x

		//display local variable in main confirming the shadowing
		System.out.println("The variable in main is: " + x);

		useLocalVariable(); //this method uses the variable in main
		useFieldVariable(); //this method uses the variable in field
		useLocalVariable(); //reinitializes the variable in main 
		useFieldVariable(); //retains it value 

		System.out.println("The variable in main is: " + x ); //still shadowing the field variable
	}

		//create method useLocalVariable and reinitialize it during each calls
		public static void  useLocalVariable() {
			int x = 30;
			System.out.println("Local x on entering useLocalVariable is: " + x);
			++x;
			System.out.println("Local x variable on exiting useLocalVariable is: " + x);
		}

		//create method useFieldVariable, field variable uses the variable in field
		//can acess it, modify it
		public static void useFieldVariable() {
			//to display that since there is no local variable bearing `'x' in this method the field variable is not shadowed
			System.out.println("The variable appearing is the field variable: " + x);
			//using the field variable, there is no local variable in this method
			x = x * 10; //whatever is in x multiplies x 
			System.out.println("useFieldVariable after exiting is now: " + x);
		}

	
}
//using for loop iteration to sum even numbers between 2 and 20

public class SumEvenNumbers{
	public static void main(String[] arg) {
		int total = 0;
		for (int evenNumbers = 2; evenNumbers  <=20; evenNumbers = evenNumbers + 2) {
			total = total + evenNumbers;

		}
		System.out.println("" + total);
	}
}
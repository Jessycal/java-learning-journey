//a program to calculate simple interest using for loop

public class InterestTwo {
	public static void main(String[] args) {

		double principal = 2000;
		double rate = 0.08;
		//using the for loop
		for (int year = 1; year <=6; year = year + 1) {
			double amount = principal * Math.pow(1.0 + rate, year);

			//System.out.printf("%4d%,20.2f%n", year, amount);
			//System.out.printf("%2d%,10.2f%n", year, amount);
		    System.out.printf("%4d%,20.4f%n", year, amount);
		}
	}
}
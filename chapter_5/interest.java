//calculate interest using for
public class Interest {
	public static void main(String[] args) {
		double principal = 1000.0;
		double rate = 0.05;

		for (int year = 1; year <=10; year =  year + 1) {
			double amount = principal * Math.pow(1.0 + rate, year);

			System.out.printf("%4d%,20.2f%n", year, amount);       

		}
	}
}
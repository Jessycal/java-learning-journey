public class VariableLengthArguments {

	public static double average(double...numbers) {
		double total = 0.0;
		for (double d: numbers){
		total = total + d;
	}
	return total/ numbers.length;
	}

	public static double minimum(double...numbers) {
		double lowGrade = numbers[0];
		for (double grade: numbers) {
			if (grade < lowGrade){
				lowGrade = grade;
			}
		}
        return lowGrade;
	}

	public static double maximum(double...numbers) {
		double highGrade = numbers[0];
		for (double grade: numbers) {
			if (grade > highGrade){
				highGrade = grade;
			}
		}
        return highGrade;
	}
   public static void main(String[] args) {
   	double number1 = 22;
   	double number2 = 33.4;
   	double number3 = 21;
   	double number4 = 12;

   	System.out.println("Average of number1 and number2 is: " + average(number1, number2));
   	System.out.println("Average of number3 and number4 is: " + average(number3, number4));
   	System.out.println("Average of number1, number2, number3, number4 is: " + average(number1, number2, number3,
   	 number4));
   	System.out.println("minimum Number is: " + minimum(number1, number2, number3, number4));
   	System.out.println("minimum Number is: " + maximum(number1, number2, number3, number4));
   }
}
public class ArraysMethod {
public static void main(String[] args) {
	int [] numbers = new int[12];
	String [] b = new String [100];

	System.out.println("The length of the array is: " + numbers.length); //returns the length of the number array
	System.out.println("The length of the b array is: " + b.length); //returns the length of the b array


	numbers[0] = 5;
	numbers[1] = 10;
	numbers[2] = 15;
	System.out.println("The number at index[0] is: " + numbers[0]);

	int result = numbers[0] * numbers[2];
	System.out.println("The product of index [0] and [2] is:  " + result);

	for (int i = 0; i < numbers.length; i++) {
		System.out.println("numbers [" + i + "] = " + numbers[i]);
	}

	
	

}
}
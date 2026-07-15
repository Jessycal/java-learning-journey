public class ArraysIntroduction {
	public static void main(String[] args) {
		int [] numbers = new int [10];
		numbers [0] = 5;

		for (int counter = 0; counter > numbers.length; counter++) {
			System.out.println("Numbers [" + counter + "] = " + numbers[counter]);
		}
	}
}
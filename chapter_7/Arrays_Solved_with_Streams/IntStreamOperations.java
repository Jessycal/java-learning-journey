//this programs solves Arrays and Arraylist problems using streams
//this program demonstrates IntStreams operations on streams created from arrays
// the IntStream technique shown here also apply to LongStream, DoubleStream for long and double datatypes

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
	public static void main(String[] args) {
		int numbers [] = {5, 30, 20, 12, 67, 89};

		System.out.printf("%s%8s%n", "Index", "Value");

		//printing the elements in the array using the traditional for loop, also showing the index(position)
		for (int counter = 0; counter < numbers.length; counter++) {
			System.out.printf("%5d%5d%n", counter, numbers[counter]);
		}

		//using IntStream to display the elements in an array

		System.out.println();
		System.out.println("The elements in the array are: ");

		System.out.println(
			IntStream.of(numbers)
		    .mapToObj(String::valueOf)
	    .collect(Collectors.joining(" ")));
	}
}
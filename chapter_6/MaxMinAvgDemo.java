//calculating the max, min and average of numbers using while loop
import java.util.Scanner;

public class MaxMinAvgDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numberCounter = 0;
		double minSoFar = 0;
		double maxSoFar = 0;
		double total = 0;

		System.out.println("@@@@@@@@Maximum, Minimum and Average of a Number");
		System.out.println("Enter your Numbers and When done press CTRL D");
		while (input.hasNext()) {
			
			double numbers = input.nextDouble();
			numberCounter = numberCounter + 1;

			if (numberCounter == 1) {
				minSoFar = numbers;
			}
			else 
				if (numbers < minSoFar) {
					minSoFar = numbers;
				}

			if (numberCounter ==1) {
				maxSoFar = numbers;
			}
			else 
				if (numbers > maxSoFar) {
					maxSoFar = numbers;
				}

		total = numbers + total;



				
			
		}
		double average = total/numberCounter;
		System.out.println("\nMax Number is: " + maxSoFar);
		System.out.println("Min is: " + minSoFar);
		System.out.println("Average Number is: " + average);



		}

		
	}

//this program reads arrays from a file and then computes the sum


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadArrays {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ReadNumbers"));
        int[] arraysValue = new int[10];   // create the array ONCE
        int index = 0;

        // Read integers into the array
        while (input.hasNextInt() && index < arraysValue.length) {
            arraysValue[index] = input.nextInt();   // actually consume the integer
            index++;
        }
        input.close();

        // Compute the sum
        int total = 0;
        for (int i = 0; i < index; i++) {   // use 'index' in case fewer numbers were read
            total += arraysValue[i];
        }

        System.out.println("Total of the array is: " + total);
    }
}
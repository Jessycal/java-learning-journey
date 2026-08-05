public class MultiDimensionalArrayDiffColumnRow {
	public static void main(String[] args) {
		int array [] [] = new int [6][]; //create two rows
		array[0] = new int [5];
		array[1] = new int [2];
		array[2] = new int [3];
		array[3] = new int [3];
		array[4] = new int [3];
		array[5] = new int [3];

		//using for loop to print out the elements in the 2D array in a more organized and consise manner

		  System.out.println("==============For Loop print=====================");
for (int row = 0; row < array.length; row++) {
    for (int column = 0; column < array[row].length; column++) {
        System.out.printf("%d ", array[row][column]);
    }
    System.out.println();  
	    }
		  
 }

	}

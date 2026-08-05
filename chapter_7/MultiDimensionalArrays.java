//this program introduces the concept of Multi-dimensional arrays
// 2D array row X matrix 

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int arrays2D [][] = {{1,  2,  31,    41 },
		                     {5,  61,  7,    81 } ,
		                     {1, 1, 20,  25}
		                 };
           System.out.println();

		  //using for loop to print out the elements in the 2D array in a more organized and consise manner

		  System.out.println("==============For Loop print=====================");
for (int row = 0; row < arrays2D.length; row++) {
    for (int column = 0; column < arrays2D[row].length; column++) {
        System.out.printf("%d ", arrays2D[row][column]);
    }
    System.out.println();  
	    }
		  
 }
}
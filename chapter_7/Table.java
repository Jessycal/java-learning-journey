
public class Table {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 3;
		int [] [] arrays2D = { {1, 2, 3},
		 {4, 5, 6},
		  {7, 8, 9}

		};
		
		 System.out.println("==============For Loop print=====================");
for (int row = 0; row < arrays2D.length; row++) {
    for (int column = 0; column < arrays2D[row].length; column++) {
        System.out.printf("%d ", arrays2D[row][column]);
    }
    System.out.println();  
	    }
		System.out.println();
	}
}
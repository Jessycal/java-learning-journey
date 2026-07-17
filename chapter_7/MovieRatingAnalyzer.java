public class MovieRatingAnalyzer {
	public static void main(String[] args) {
		int [] ratingsData = {5, 4, 5, 3, 2, 5, 5, 4, 3, 1, 2, 5, 5, 5, 6, 0, 12, 5, 4, 3, 2, 5, 1, 5, 4};
		int [] frequency = new int [6];

		for (int answer = 0; answer < ratingsData.length; answer++) {
			try {
				++frequency[ratingsData[answer]];
			}
			catch (ArrayIndexOutOfBoundsException errorExceptionHandling) {
				System.out.println(errorExceptionHandling);
				System.out.println(" Invalid Rating: [ " + answer + "] = " + ratingsData[answer]);
								System.out.println("\n*********************");


			}
		}
		        System.out.printf("%s%10s%n", "Rating",     "Frequency"); // column headings
		        for (int rating = 1; rating < frequency.length; rating++) {
		        	        System.out.println("[ " + rating + "] =   " + frequency[rating]);

		        }
		        		int otherRating = frequency[1] + frequency[2] + frequency[3] + frequency[4];


		        if ( frequency[5] > otherRating) {
		        	System.out.println(">>>>>> BLOCKBUSTER <<<<<<<<<<<<");

		        }
		        else {
		        	System.out.println("--------- Average Movie -------- ");
		        }

	}
}
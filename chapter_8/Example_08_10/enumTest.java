import java.util.EnumSet;



public class enumTest {
	public static void main(String[] args) {
		//to access only one enum constant JHTP
		EnumDemonstration book =  EnumDemonstration.JHTP;

		System.out.println("Book title is: " + book.getbookTitle());
		System.out.println("Copyright year is: " + book.getcopyRightYear());
		System.out.println();
		System.out.println("Using for loop to print the constants:");
		System.out.println();

		//TO PRINT ALL THE ENUM CONSTANTS using enhanced for
		for (EnumDemonstration demonstration: EnumDemonstration.values()) {
			System.out.printf("%-10s%-45s%s%n", demonstration, demonstration.getbookTitle(),
			 demonstration.getcopyRightYear());

		}
		      System.out.printf("%nDisplay a range of enum constants:%n");
		      // print first four books                                 
      for (EnumDemonstration demonstration : EnumSet.range(EnumDemonstration.JHTP, 
      	EnumDemonstration.CPPHTP)) {
         System.out.printf("%-10s%-45s%s%n", demonstration,
             demonstration.getbookTitle(), demonstration.getcopyRightYear());
      }


	}
}
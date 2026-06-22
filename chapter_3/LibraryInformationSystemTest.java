import java.util.Scanner;

public class LibraryInformationSystemTest {
	public static void main(String[] args){

		//creating objects
		Scanner input = new Scanner(System.in);
		LibraryInformationSystem book1 = new LibraryInformationSystem();
		LibraryInformationSystem book2 = new LibraryInformationSystem();

		System.out.println("--------Book1-------");
		System.out.print("Enter book title:");
		String title1 = input.nextLine();
		System.out.print("Enter Author:");
		String author1 = input.nextLine();
		System.out.print("Enter year: ");
		int year1 = input.nextInt();
		System.out.print("Enter price:");
		double price1 = input.nextDouble();
		System.out.print("Is the book Available? true/false");
		boolean available = input.nextBoolean();
		input.nextLine();

		//store book1 details using setters
		book1.setTitle(title1);
		book1.setAuthor(author1);
		book1.setYear(year1);
		book1.setPrice(price1);
		book1.setIsAvailable(available);

		//display book1 using getters
		System.out.println("\n------Book1 result--------");
		System.out.println("Title: " + book1.getTitle());
		System.out.println("Author: " + book1.getAuthor());
		System.out.println("Year: " + book1.getYear());
		System.out.println("price " + book1.getPrice());
		System.out.println("IsAvailable " + book1.getAvailabiltyMessage());
		System.out.println("Price category: " + book1.getPriceCategory());


		





	}
}


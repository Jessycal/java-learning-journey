import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book book1 = new Book("Things fall apart", "Chinua Achebe", 29.99, 5);
		Book book2 = new Book("purple Hibiscus", "chimamanda Adichie", -5.00, -3);
		//print both books details
		System.out.printf("%s by: %s price:$%.2f Copies:%d%n", book1.getTitle(),book1.getAuthor(), book1.getPrice(), book1.getCopiesAvailable());
		System.out.printf("%s by: %s price:$%.2f Copies:%d%n", book2.getTitle(),book2.getAuthor(), book2.getPrice(), book2.getCopiesAvailable());

		//borrow book1 
		System.out.println("\nBorrowing book1....");
		book1.borrowBook();
		System.out.printf("Copies available: %d%n", book1.getCopiesAvailable());

		//return book
		System.out.println("\nReturning book 1....");
		book1.returnBook();
		System.out.printf("copies available: %d%n", book1.getCopiesAvailable());

		//borrow book2
		System.out.println("\nBorrowing book2....");

	    book2.borrowBook();
		System.out.printf("Copies available: %d%n", book2.getCopiesAvailable());

		//return book
		System.out.println("\nReturning book 2....");
		book2.returnBook();
		System.out.printf("copies available: %d%n", book2.getCopiesAvailable());






	} 
}
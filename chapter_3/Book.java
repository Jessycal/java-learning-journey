// a system for a University Library create a class 'Book' that represents a book in the library

public class Book {
	//create the instance variable
	private String title;
	private String author;
	private double price;
	private int copiesAvailable;

	//account constructor
	public Book (String title, String author, double price, int copiesAvailable) {
		this.title = title;
		this.author = author;

				// validate that the price is greater than 0.0 or defualts to 0.0
		if (price >= 0.0) {
			this.price = price;
		}

		// validate the copies avaiable must be greater than 0 or defaults to 0
		if (copiesAvailable >= 0) {
			this.copiesAvailable = copiesAvailable;
		}
	}

		//Method borrowBook()  if copies are available, it reduces copiesAvailable by 1, otherwise it prints 
		//"Sorry no copies available"

	public void borrowBook () {
			if (copiesAvailable >=1 ) {
				copiesAvailable = copiesAvailable - 1;
			} else {
				System.out.println("Sorry no copies available!");
			}
		}

		//Method return book increase book available by 1
	public void returnBook() {
			copiesAvailable = copiesAvailable + 1;
		}

		

		//Method that gets the name
	public String getTitle () {
			return title;
		}

	public String getAuthor (){
			return author;
		}

	public double getPrice (){
			return price;
		}

	public int getCopiesAvailable () {
			return copiesAvailable;
		}



	}

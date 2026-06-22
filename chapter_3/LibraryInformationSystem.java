public class LibraryInformationSystem {
	//create instance variable
	private String title;
	private String author;
	private int year;
	private double price;
	private boolean isAvailable;

	//setting the setter to store title
	public void setTitle(String title) {
		this.title = title;
	}

	//setting the setter to store author
	public void setAuthor(String author) {
		this.author = author;
	}

	//setting the setter to store year
	public void setYear(int year) {
		this.year = year;
	}

	//setting the setter to store price
	public void setPrice(double price) {
		this.price = price;
	}

	//setting the setter to store avaiability
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	//setting the getter to display title
	public String getTitle() {
		return title;
	}

	//setting the getter to display author
	public String getAuthor() {
		return author;
	}

	//setting the getter to display year
	public int getYear() {
		return year;
	}

	//setting the getter to display price
	public double getPrice() {
		return price;
	}

	//setting the getter to display book availabilty
	public boolean getIsAvailable() {
		return isAvailable;
	}

	//setting the getter to display avaiabilty message
	public String getAvailabiltyMessage() {
		if (isAvailable ) {
			return "This book is Available";
		}
		else {
			return "This book is not Available";
		}
	}

	//setting the getter to display price category
	public String getPriceCategory() {
		if (price < 20) {
			return "Budget";
		}
		else if (price >= 20 && price <= 50) {
			return "Standard";
		}
		else {
			return "Premium";
		}
	}
}
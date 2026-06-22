//Account class that contains an name instance variable
//and methods to set and get its value.
public class Account {
	private String name; //the instance variable

	//method to set the name in the object
	public void setName(String name) {
		this.name = name; //store the name
	}

	//method to retrieve the name in the object using get
	public String getName() {
		return name; //returns the vale of name to the caller
	}
}
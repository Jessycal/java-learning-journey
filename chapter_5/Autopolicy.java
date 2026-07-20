//class blueprint for a car company Auto policy insurance

public class Autopolicy {
	//declare instance variables
	private String state;
	private String makeAndModel;
	private int accountNumber;

	//constructors

	public Autopolicy(String state, String makeAndModel, int accountNumber) {
		this.state = state;
		this.makeAndModel = makeAndModel;
		this.accountNumber = accountNumber;
	}

	//setter for state
	public void setState(String state) {
		this.state = state;
	}

	//getter for state
	public String getState() {
		return state;
	}

	//setter for makeandmodel
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	//getter for makeandmodel
	public String getMakeAndModel() {
		return makeAndModel;
	}

	//setter for accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	//getter for accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}

	//predicate method that determines whether the state has no fault insurance
	public boolean isNoFaultState() {
		boolean noFaultState; //variable 
	

	//determine whether the state has no fault auto insurance

	switch (getState()) {
		//abbreviate the state names 
	case "MA":
	case "NY":
	case "NJ":
	case "PA":
		noFaultState = true;
		break;
	default:
		noFaultState = false;
		break;
	}
	return noFaultState;
}
}
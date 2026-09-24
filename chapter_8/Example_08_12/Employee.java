public class Employee {
	private static int count; //class variable
	private String firstName; //instance variable
	private String lastName; //instance variable

	//constructor
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		++count; // increment static count of employees

		// output String indicating that constructor was called
		System.out.printf("Employee constructor: %s %s , count = %d%n", firstName, lastName, count);
	}

	//method to get name
	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}
	public static int getCount() {
		return count;
	}


}
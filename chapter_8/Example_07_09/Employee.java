//this class has reference to other objects 
public class Employee{
	private String firstName;
	private String lastName;
	private Date hireDate;
	private Date birthDate;


	//constructor
	public Employee(String firstName, String lastName, Date hireDate, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.birthDate = birthDate;
	}

	//convert employee to string format
	public String toString() {
		return String.format("%s , %s Hired: %s  BirthDay: %s", firstName, lastName, hireDate, birthDate);
	}

}
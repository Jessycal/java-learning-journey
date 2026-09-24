public class EmployeeTest {
	public static void main(String[] args) {

		//show count of employees before initialization
		System.out.println("Count of employees before initailization is: " + Employee.getCount());
		Employee employeeObject = new Employee("chioma" ,"okeke");
		Employee employeeObject2 = new Employee("Uche", "Okeke");
		System.out.println("Employee name is: " + employeeObject.getfirstName());
		System.out.println("Employee surname is: " + employeeObject.getlastName());
		System.out.println();
		System.out.println("***********************************************************");

		System.out.println("Employee name is: " + employeeObject2.getfirstName());
		System.out.println("Employee surname is: " + employeeObject2.getlastName());
		System.out.println();

		System.out.println("Employee total count is: " + Employee.getCount());

	}
}
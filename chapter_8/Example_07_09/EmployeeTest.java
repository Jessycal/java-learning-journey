public class EmployeeTest {
	public static void main(String[] args) {
		Date birth = new Date (7, 12, 2006);
		Date hireDate = new Date(2, 12, 2026);
		Employee EmployeeObject = new Employee ("chioma", "okeke", hireDate, birth);

		System.out.println(EmployeeObject);
	}
}
public class GradeBookTest {
	public static void main(String[] args) {
		
		int [] scores = { 10, 20, 30, 40, 50,65, 90, 100};

		GradeBook gradeBookVersion1 = new GradeBook("CIT 108", scores);
		System.out.println("Result checking portal ");
		System.out.println("*****************************");
		System.out.println("The course Name is: " + gradeBookVersion1.getCourseName());
		gradeBookVersion1.processGrades();

	}
}
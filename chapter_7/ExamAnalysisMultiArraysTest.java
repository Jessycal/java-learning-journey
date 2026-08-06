public class ExamAnalysisMultiArraysTest {
	public static void main(String[] args) {
		int grades [][] = {
			              {5,10, 16, 20},
		                  {4, 12, 76, 20},
		                  {67, 80, 54, 12}
		              };

		ExamAnalysisMultiArrays exam = new ExamAnalysisMultiArrays("Java programming", grades );
		
		exam.displayGradeReport();
	}
}
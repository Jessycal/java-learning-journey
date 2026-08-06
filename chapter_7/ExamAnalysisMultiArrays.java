public class ExamAnalysisMultiArrays {

    private String courseName; 
    private final int[][] grades;

    // constructor
    public ExamAnalysisMultiArrays(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // set courseName (remove if you keep courseName final)
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // ---------- Main report method ----------
    public void displayGradeReport() {
        System.out.println("Grade Maximum is: " + getMaximum());
        System.out.println("Grade Minimum is: " + getMinimum());
        System.out.println("Class average is: " + getAverage()); 
        outputGrades();
    }

    // ---------- get minimum grade ----------
    public int getMinimum() {
        int lowGrade = grades[0][0];   

        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    // ---------- get maximum grade ----------
    public int getMaximum() {
        int highGrade = grades[0][0];   

        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    // ---------- get average for one student (row) ----------
    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    // ---------- get class average (all grades) ----------
    public double getAverage() {                     // overloaded version
        int total = 0;
        int count = 0;
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                total += grade;
                count++;
            }
        }
        return (double) total / count;
    }

    // ---------- output grades table ----------
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            "); // align column heads

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }

            double average = getAverage(grades[student]); // calls the per-student version
            System.out.printf("%9.2f%n", average);
        }
    }
}
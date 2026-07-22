/* UML DIAGRAM FOR THIS CLASS
┌────────────────────────────────────────┐
│              GradeBook                 │   ← section 1: class name

├────────────────────────────────────────┤
│ - courseName : String                  │   ← section 2: attributes (instance variables)
│ - grades : int[]                       │
├────────────────────────────────────────┤
│ + GradeBook(courseName: String,        │   ← section 3: operations (methods)

│            grades: int[])              │
│ + setCourseName(courseName: String)    │
│   : void                               │
│ + getCourseName() : String             │
│ + processGrades() : void               │
│ + outputGrades() : void                │
│ + getMinimum() : int                   │
│ + getMaximum() : int                   │
│ + getAverage() : double                │
│ + outputBarChart() : void              │
└────────────────────────────────────────┘ */
public class GradeBook {
	private String courseName; //instance variable
	private int [] grades;     //instance variable array

	//constructor
	public GradeBook(String courseName, int [] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}

	//setter for coursename
	public void setCourseName(String courseName)  {
		this.courseName = courseName;
	}

	// getter for getcourname
	public String getCourseName() {
		return courseName;
	} 

	//process grade
	public void processGrades() {
		 outputGrades();
		 // class Minimum display
	System.out.println("The class Minimum Grade is: " + getMinimum());

	//class Maximum display
	System.out.println("The class highest grade is: " + getMaximum());

	//class Average display
	System.out.println("The class Average is: " + getAverage());

	//display barchart
	outputBarChart();

	//Numbers of students who got  A B C D F
	resultLabel();

	}

	

	//building the methods

	public int getMinimum() {
		int lowestgrade = grades[0];
		//loop through using for loop
		for (int gradeCounter = 0; gradeCounter < grades.length; gradeCounter++) {
			if (grades[gradeCounter] < lowestgrade) {
				lowestgrade = grades[gradeCounter];
			}
		}
		return lowestgrade;
	}

	public int getMaximum() {
		int highestGrade = grades[0];
		for (int gradeCounter = 0; gradeCounter < grades.length; gradeCounter++) {
			if (grades[gradeCounter] > highestGrade) {
				highestGrade = grades[gradeCounter];
			}
		}
		return highestGrade;
	}

	public double getAverage() {
		double total = 0;
		for (int gradeCounter = 0; gradeCounter< grades.length; gradeCounter++) {
			total += grades[gradeCounter] ;

		}
		return (double) total/ grades.length;
	}

	public void outputBarChart() {
    System.out.println("Grades distribution:");

    int[] frequency = new int[11];
    for (int grade : grades) {
        ++frequency[grade / 10];
    }

    for (int counter = 0; counter < frequency.length; counter++) {
        // print label
        if (counter == 10) {
            System.out.printf("%5d: ", 100);
        } else {
            System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
        }

        // print bar of asterisks
        for (int stars = 0; stars < frequency[counter]; stars++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

	// output the contents of the grades array
   public void outputGrades() {
      System.out.printf("The grades are:%n%n");

      // output each student's grade                             
      for (int student = 0; student < grades.length; student++) {
         System.out.printf("Student %2d: %3d%n",                 
            student + 1, grades[student]);                       
      }                                                          
   } 

   //calculate gradeRange
   public void resultLabel() {
   	System.out.println("	Numbers of students who got  A B C D F ");
   	int aCount = 0;
   	int bCount = 0;
   	int cCount = 0;
   	int dCount = 0;
   	int fCount = 0;


   for (int counter = 0; counter < grades.length; counter++) {
   	
   	switch (grades[counter]/10) {
   	case 9:
   	case 10: 
   		aCount++;
   		System.out.println("Excellent Result !!!!!");
   		break;

   	case 8: //grades between 80
   		bCount++;
   		System.out.println("Nice Result");
   		break;

   	case 7:
   		cCount++;
   		System.out.println("Good performance");
   		break;

   	case 6:
   		dCount++;
   		System.out.println("More room for better performance");
   		break;

   	default:
   		fCount++;
   		System.out.println("Very poor result, Resit compulsory");
   		break;


   	}
   	
	}
	System.out.println("\nNumber of students who received each grade:");
			System.out.println("A: " + aCount);
			System.out.println("B: " + bCount);
			System.out.println("C: " + cCount);
			System.out.println("D: " + dCount);
			System.out.println("F: " + fCount);

		if (fCount > aCount + bCount) {
			System.out.println("Class general performance based on number of F");
			System.out.println("class performance is poor, number of F is: " + fCount);
		}




   }
} 





  




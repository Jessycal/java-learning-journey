//student class that stores a student name and average
public class Student {
	//instance variable
	private String name;
	private double average;

	//constructors initializes instance variables
	public Student (String name, double average) {
		this.name = name;

		//constructor to validate that average is > 0.0 and <= 100.00 otherwise keep average as 0.0 default value

		if (average > 0.0) {
			if (average <= 100.00) {
				this.average = average; //assign to instance variable
			}
		}
	}

	//set the student name
	public void setName(String name) {
		this.name = name;
	}

	// return student name
	public String getName() {
		return name;
	}

	// set average

	public void setAverage(double average) {
		//set validation to the average instance variable
		if (average > 0.0) {
			if (average <= 100.00) {
				this.average = average;
			}
		}
	}

	//retrieve the student average
	public double getAverage() {
		return average;
	}


	//determine and return the student grade using average

	public String getLetterGrade() {
		String LetterGrade = ""; //initialized to empty

		if (average >= 90.0) {
			LetterGrade = "A";
		}
		else if (average >= 80.0) {
			LetterGrade = "B";
		}
		else if (average >= 70.0) {
			LetterGrade = "C";
		}
		else if (average >= 60.0) {
			LetterGrade = "D";

		}
		else {
			LetterGrade = "F";
		}


		return LetterGrade;
	}


}
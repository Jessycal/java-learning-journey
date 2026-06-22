public class CollegeAdmission {
	//instance variable
	private String name;
	private int age;
	private double score;

	//creating the setters and getters method
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setScore(double score) {
		this.score = score;


	}

	public double getScore() {
		return score;
	}

	//method to determine grade based on score

	public String getGrade() {
		if (score >= 90) {
			return "A";
		}

		else if (score >= 80) {
			return "B";
		}

		else if (score >= 70) {
			return "C";
		}

		else if (score >= 60) {
			return "D";
		}

		else  {
			return "F";
		}
	}

}
/* implementing the `student` UML diagram
┌────────────────────────────────────────┐
│               Student                  │
├────────────────────────────────────────┤
│  - name : String                       │
│  - age : int                           │
│  - grade : double                      │
├────────────────────────────────────────┤
│  + setName(name : String) : void       │
│  + getName() : String                  │
│  + setAge(age : int) : void            │
│  + getAge() : int                      │
│  + setGrade(grade : double) : void     │
│  + getGrade() : double                 │
└────────────────────────────────────────┘
*/
public class Student {
	private String name; //instance variable
	private int age; //instance variable
	private double grade; //instance variable

	//method to set the name in the object
	public void setName (String name) {
		this.name = name;
	}
	//using get() method to retrieve the object 'name'
	public String getName() {
		return name;
	}

	//method to the age in the object
	public void setAge (int age) {
		this.age = age;
	}

	//using get( method to retrieve the object 'age')
	public int getAge () {
		return age;
	}

	//method to set the grade in the object
	public void setGrade (double grade) {
		this.grade = grade;
	}

	// using get () to retrieve the object 'grade'

	public double getGrade () {
		return grade;
	}
}
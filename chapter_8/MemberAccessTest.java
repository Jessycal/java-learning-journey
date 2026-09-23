//this program demontrates that member class doesnt have access to methods and variables declared private
//in domain class

public class MemberAccessTest {
	public static void main(String[] args) {
		Time timeObject = new Time();

		//attempting to access the private instance variable in domain class Time
		timeObject.hour = 3; //it prints error: hour has private access in Time
		timeObject.seconds = 9; //error: seconds has private access in Time
		timeObject.minute = 2; //error: minute has private access in Time
		}
	}
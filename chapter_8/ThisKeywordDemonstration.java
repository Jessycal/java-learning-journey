//this program demonstrates the implicit and explicit use of the this reference
//public class ThiskeywordDemonstration is the driver class
//the JVM calls public static void main(String[] args) { 
//to start the program SimpleTime time = new SimpleTime(15, 30, 19);
//simpleTime class is the model class

public class ThisKeywordDemonstration {
	public static void main(String[] args) {
		simpleTime time = new simpleTime(10, 20, 30);
		System.out.println(time.callString());

	}
}

// class SimpleTime demonstrates the "this" reference
class simpleTime {
	private int hour;
	private int minute;
	private int seconds;


	// if the constructor uses parameter names identical to 
   // instance variable names the "this" reference is 
   // required to distinguish between the names
	public simpleTime(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d: %02d: %02d", this.hour, this.minute, this.seconds);
	}


	// use explicit and implicit "this" to call toUniversalString
	public String callString() {
		return String.format("%24s: %s%n%24s: %s", 
         "this.toUniversalString()", this.toUniversalString(),
         "toUniversalString()", toUniversalString());
	}


}
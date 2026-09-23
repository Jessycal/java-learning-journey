public class TimeTest {
	public static void main(String[] args) {

		Time timeObject = new Time(); //create time object

		//output string representation of the time

        System.out.println("After time object is created time is: ");
		timeObject.displayTime();
		System.out.println();


		//change time and output updated time
		timeObject.setTime(12, 7, 34);
		System.out.println("The time with valid input is:");
		timeObject.displayTime();
		System.out.println();

		//attempt to set time with invalid input
		try {
		timeObject.setTime(98, 67, 50);
	}
	  catch (IllegalArgumentException errorMessage) {
	  	System.out.println(errorMessage.getMessage());
	  }

	   // display time after attempt to set invalid values
	  System.out.println("After calling time with invalid numbers");
	  timeObject.displayTime();


	 


	}
}
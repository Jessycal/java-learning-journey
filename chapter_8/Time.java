//this program displays time in 24 hour format

public class Time {
	//declare variables
	private int hour; //range from 0-23
	private int minute; //range from 0-59
	private int seconds; //range from 0-59


	

	public void setTime(int hour, int minute, int seconds) {
		//validate the time entry
		if (hour < 0 || hour >= 24  ||minute < 0 || minute >= 60||  seconds < 0 || seconds >=60)
//using throw statement to indicate a problem has occurred if the input entered does not meet the validation

       {
       	throw new IllegalArgumentException(
       		"Hour, Minutes, or Seconds entered isnt valid");
       }
       this.hour = hour;
       this.minute = minute;
       this.seconds = seconds;

	}

    // convert to String in universal-time format (HH:MM:SS)

    public String toUniversalString() {
    	return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
    	return String.format("%d%02d:%02d:%02d %s", hour, minute, seconds,
    		((hour == 0 || hour == 12 ) ? 12 : hour % 12),
    	minute, seconds, (hour < 12 ? "AM" : "PM"));
    }

    public void displayTime() {
    	System.out.println("The universal time is: " + toUniversalString());
    	System.out.println("The standard time is: " + toString());
    }
}
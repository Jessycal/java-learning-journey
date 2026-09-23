//this program demonstrates class declaration with overloaded constructors
public class OverLoadedConstructors {
	
	private int hour ;
	private int minute;
	private int second;

//initialize each instance variable to 0
	public OverLoadedConstructors() {
		this(0,0,0); //invoke constructor with all three arguement hour, minute, second
	}

	public OverLoadedConstructors(int hour) {
		this(hour, 0, 0); //invoke constructor with only argument hour. minute, second default to 0
	} 

	public OverLoadedConstructors(int hour, int second) {
		this(hour, 0, second); //invoke constructor with hour&seond minute default to 0
	}

   //  hour, minute and second supplied   
public OverLoadedConstructors(int hour, int minute, int second) {
	if (hour < 0 || hour >= 24) {
		throw new IllegalArgumentException("Hour range must be between 0-23");
	}

	if (minute < 0 || minute >= 60) {
		throw new IllegalArgumentException("Minute must be between 0-59");
	}
	if (second < 0 || second >= 60) {
		throw new IllegalArgumentException("Seconds must be between 0-59");
	}
	this.hour = hour;
   this.minute = minute;
   this.second = second;
}
   //another OverLoadedConstructors object 

public OverLoadedConstructors(OverLoadedConstructors time) {
	//invoke constructor with arguments
	this(time.hour, time.minute, time.second);
}

// Set Methods
   // set a new time value using universal time;  
   // validate the data

public void setTime(int hour, int minute, int second) {
	if (hour < 0 || hour >= 24) {
		throw new IllegalArgumentException("Hour must be between 0-23");
	}
	if (minute < 0 || minute >=60) {
		throw new IllegalArgumentException("Minute must be between 0-59");
	}
	if (second < 0 || second >=60){
		throw new IllegalArgumentException("second must be between 0-59");
	}
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}

//validate and set hour

public void setHour(int hour) {
	if (hour < 0 || hour >= 24) {
		throw new IllegalArgumentException("Hour must be between 0-23");
	}
	this.hour = hour;
}

//validate and set minute
public void setMinute(int minute) {
	if (minute < 0 || minute >= 60) {
		throw new IllegalArgumentException("Minute must be between 0-59");
	}
	this.minute = minute;
}

//validate and set the second
public void setSecond(int second) {
	if (second < 0 || second >=60) {
		throw new IllegalArgumentException("second must be between 0-59;");
	}
	this.second = second;
}

// get methods

//get hour
public int getHour() {
	return hour;
}

//get minute
public int getMinute() {
	return minute;
}

//get second

public int getSeconds() {
	return second;

}

// convert to String in universal-time format (HH:MM:SS)

public String toUniversalString() {
	return String.format("%02d: %02d: %02d", getHour(), getMinute(), getSeconds());
}

// convert to String in standard-time format (H:MM:SS AM or PM)
public String toString() {
	return String.format("%d: %02d: %02d: %s",
       ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
       getMinute(), getSeconds(), (getHour() < 12 ? "AM" : "PM"));
}
}
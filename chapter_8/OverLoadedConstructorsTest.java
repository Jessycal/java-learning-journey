//overloaded constructors test class

public class OverLoadedConstructorsTest {
	public static void main(String[] args) {
		OverLoadedConstructors timeObject = new OverLoadedConstructors(); //0.0.0
		OverLoadedConstructors timeObject2 = new OverLoadedConstructors(3); //3.0.0
		OverLoadedConstructors timeObject3 = new OverLoadedConstructors(3, 0, 5); 
		OverLoadedConstructors timeObject4 = new OverLoadedConstructors(3, 45, 8); 
		OverLoadedConstructors timeObject5 = new OverLoadedConstructors(timeObject4);


		System.out.println("*****************TIME DISPLAY************************");
		displayTime("Time 1: default time", timeObject);
		System.out.println();
		displayTime("Time 2: only hour displayed", timeObject2);
		System.out.println();
		displayTime("Time 3: hour and seconds displayed", timeObject3);
		System.out.println();
		displayTime("Time 4: hour, minutes, seconds displayed", timeObject4);
		System.out.println();
		displayTime("Time 5: copy of time 4", timeObject5);

		//attempt to initailize timeobject6 with values out of range
		try {
			OverLoadedConstructors timeObject6 = new OverLoadedConstructors(67,89, 90);
		}
		catch (IllegalArgumentException error) {
			System.out.println( error.getMessage());

		}

		
	}
	//display time in 24-hour and 12-hour format
		public static void displayTime(String header, OverLoadedConstructors t) {
			System.out.printf("%s%n   Universal time: %s%n   Standard time:  %s%n%n",
         header, t.toUniversalString(), t.toString());
		}
}
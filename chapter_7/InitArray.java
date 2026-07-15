public class InitArray {
	public static void main(String[] args) {
		String [] month = {"JANUARY", "FEBUARY", "MARCH", "APRIL", "MAY", 
		"JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER","NOVEMBER", "DECEMBER"};
		for (int counter = 0; counter < month.length; counter++) {
						System.out.println("Months: [" + counter + "] = " + month[counter]);

		}
	}
}
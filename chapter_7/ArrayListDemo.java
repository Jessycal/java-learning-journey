import java.util.ArrayList;

public  class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList < String > name = new ArrayList <> ();
		name.add("chioma"); //add an element to the end of the ArrayList
		name.add("Jacintha");
		name.add("Frances");
		name.add("Chi");
		//name.remove(1);
		name.add(0, "Chichi"); //adds this at the specified index position 1



		System.out.println("The contents in the arrayList are: " + name);
		System.out.println();
		System.out.println("The size of the array is: " + name.size()); //gets the size of the array
		System.out.println("Returns the name at index[0] :" + name.get(0)); //Returns the element at the specified index.

		for (String value: name) {
			if (value.length() < 5) {
				System.out.println("Items with names longer than 5: " + value); //print names longer than 5 characters
			}
		}

	}
}
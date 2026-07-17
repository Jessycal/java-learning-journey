//this program displays the frequency of grades in a class in a barchart
// the grade range are 0-9; 10-19; 20-29; 30-39; 40-49; 50-59; 60-69; 70-79; 80-89; 90-99; 100-109
/*So instead of storing the grades themselves, the program stores the counts in an array with 11 elements, where:

    array[0] = number of grades in the 0–9 range → 0

    array[1] = number of grades in the 10–19 range → 0

    …

    array[6] = number of grades in the 60–69 range → 1

    array[7] = number of grades in the 70–79 range → 2

    array[8] = number of grades in the 80–89 range → 4

    array[9] = number of grades in the 90–99 range → 2

    array[10] = number of grades of 100 → 1 */

    public class BarchartGradeDisplay {
    	public static void main(String[] args) {
    		//storing the grade in an array
    		int [] gradesArray = {3,9,4,6,8,9,1, 2,  4, 2, 1};

    		System.out.println("***************Grade Barchart Display**************");
    		for (int counter = 0; counter < gradesArray.length; counter++) {
    			if (counter==10) {
    				System.out.printf("%5d", 100);

    			}
    			else {
            System.out.printf("%02d-%02d: ", 
               counter * 10, counter * 10 + 9); 
         } 

         // print bar of asterisks                           
         for (int stars = 0; stars < gradesArray[counter]; stars++) {
            System.out.print("*");                           
         } 

         System.out.println(); 
      } 
   } 
} 
    		
    	
    
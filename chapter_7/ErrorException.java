public class ErrorException  {
    public static void main(String[] args) {
int[] numbers = {10, 20, 30};
try {
    System.out.println(numbers[6]);  // index 5 doesn't exist

}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Oops, that index is invalid!");
    System.out.println("Details: " + e);
}
System.out.println("Program continues...");
}
}
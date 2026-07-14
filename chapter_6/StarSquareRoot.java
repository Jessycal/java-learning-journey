import java.util.Scanner;

public class StarSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length: ");
        int side = input.nextInt();

        squareOfAsterisks(side);
    }

    // prints a solid square of asterisks, 'side' rows by 'side' columns
    public static void squareOfAsterisks(int side) {
        for (int row = 0; row < side; row++) {
            for (int column = 0; column < side; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
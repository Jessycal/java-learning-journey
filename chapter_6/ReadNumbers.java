import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("myNumbers"));
        while (input.hasNextInt()) {
            int y = input.nextInt();
            System.out.println(y);
        }
    }
}
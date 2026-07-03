public class Swap {
public static void main(String[] args) {
    int x = 5;
    int y = 10;
    swap(x, y);
    System.out.println("x = " + x + ", y = " + y);
}

public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
}
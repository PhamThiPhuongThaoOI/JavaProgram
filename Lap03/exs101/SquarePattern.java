package Lap03.exs101;
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        testSquarePattern();
    }

    // Method to print square pattern
    public static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // Method to test squarePattern method
    public static void testSquarePattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        squarePattern(size);
        scanner.close();
    }
}

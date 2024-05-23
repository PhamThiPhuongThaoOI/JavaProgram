package Lap03.exs101;
import java.util.Scanner;
public class CheckPattern {
    public static void main(String[] args) {
        testCheckerPattern();
    }

    // Method to print checkerboard pattern
    public static void checkerPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row % 2 == 0) { // For even rows (2, 4, 6, ...)
                    System.out.print("# ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    // Method to test checkerPattern method
    public static void testCheckerPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        checkerPattern(size);
        scanner.close();
    }
}

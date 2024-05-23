package Lap03.exs101;
import java.util.Scanner;
public class BoxPatterns {
    public static void main(String[] args) {
        testBoxPattern();
    }

    // Method to print box pattern A
    public static void boxPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  "); // Intermediate blanks
                }
            }
            System.out.println();
        }
    }

    // Method to print box pattern B
    public static void boxPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to print box pattern C
    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("# ");
                }
            } else {
                System.out.print("# ");
                for (int i = 2; i < n; i++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // Method to print box pattern D
    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n || row + 1 == n / 2) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("# ");
                }
            } else {
                System.out.print("# ");
                for (int i = 2; i < n; i++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // Method to test box pattern methods
    public static void testBoxPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        System.out.println("\nPattern A:");
        boxPatternA(size);

        System.out.println("\nPattern B:");
        boxPatternB(size);

        System.out.println("\nPattern C:");
        boxPatternC(size);

        System.out.println("\nPattern D:");
        boxPatternD(size);

        scanner.close();
    }
}

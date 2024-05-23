package Lap03.exs101;
import java.util.Scanner;
public class hillPattern {
    public static void main(String[] args) {
        testHillPatternX();
    }

    // Method to print hill pattern A
    public static void hillPatternA(int rows) {
        int numCols = 2 * rows - 1;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= numCols; col++) {
                if (row + col >= rows + 1 && row >= col - rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to print hill pattern B
    public static void hillPatternB(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row + col >= rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to print hill pattern C
    public static void hillPatternC(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to print hill pattern D
    public static void hillPatternD(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row + col <= rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to test hill pattern methods
    public static void testHillPatternX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = scanner.nextInt();

        System.out.println("\nPattern A:");
        hillPatternA(rows);

        System.out.println("\nPattern B:");
        hillPatternB(rows);

        System.out.println("\nPattern C:");
        hillPatternC(rows);

        System.out.println("\nPattern D:");
        hillPatternD(rows);

        scanner.close();
    }
}

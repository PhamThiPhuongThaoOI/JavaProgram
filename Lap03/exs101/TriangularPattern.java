package Lap03.exs101;
import java.util.Scanner;
public class TriangularPattern {
        public static void main(String[] args) {
            testTriangularPattern();
        }

        // Method to print triangular pattern A
        public static void triangularPatternA(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }

        // Method to print triangular pattern B
        public static void triangularPatternB(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    if (row + col <= n + 1) {
                        System.out.print("# ");
                    }
                }
                System.out.println();
            }
        }

        // Method to print triangular pattern C
        public static void triangularPatternC(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    if (row >= col) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  "); // Leading blanks
                    }
                }
                System.out.println();
            }
        }

        // Method to print triangular pattern D
        public static void triangularPatternD(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    if (row + col >= n + 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  "); // Leading blanks
                    }
                }
                System.out.println();
            }
        }

        // Method to test triangular pattern methods
        public static void testTriangularPattern() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size: ");
            int size = scanner.nextInt();

            System.out.println("\nPattern A:");
            triangularPatternA(size);

            System.out.println("\nPattern B:");
            triangularPatternB(size);

            System.out.println("\nPattern C:");
            triangularPatternC(size);

            System.out.println("\nPattern D:");
            triangularPatternD(size);

            scanner.close();
        }
    }

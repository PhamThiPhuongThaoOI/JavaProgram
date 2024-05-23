package Lap03.exs101;
import java.util.Scanner;
public class TimeTable {
    public static void main(String[] args) {
        testTimeTable();
    }

    // Method to print multiplication table
    public static void timeTable(int n) {
        System.out.print("* | ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    // Method to test timeTable method
    public static void testTimeTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        timeTable(size);
        scanner.close();
    }
}

package Lap03.exs002;
import java.util.Scanner;
public class FactorialRecursion {
    public static int factorial(int n) {
        // Base case: n = 0, giai thừa của 0 là 1
        if (n == 0) {
            return 1;
        }
        // Trường hợp đệ quy: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = scanner.nextInt();

        // Gọi hàm đệ quy để tính giai thừa và hiển thị kết quả
        System.out.println("Factorial of " + n + " is: " + factorial(n));

        scanner.close();
    }
}


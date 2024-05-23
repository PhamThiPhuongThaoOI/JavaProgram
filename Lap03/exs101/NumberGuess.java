package Lap03.exs101;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        guessNumber();
    }

    public static void guessNumber() {
        final int SECRET_NUMBER = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int trials = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            trials++;

            if (guess < SECRET_NUMBER) {
                System.out.println("Try higher.");
            } else if (guess > SECRET_NUMBER) {
                System.out.println("Try lower.");
            } else {
                System.out.println("You got it in " + trials + " trials!");
                break;
            }
        }

        scanner.close();
    }
}

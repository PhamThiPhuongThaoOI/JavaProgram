package Lap03.exs101;
import java.util.Scanner;
public class WordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Guessing Game!");
        guessWord(scanner);

        scanner.close();
    }

    public static void guessWord(Scanner scanner) {
        System.out.print("Enter the word to be guessed: ");
        String secretWord = scanner.nextLine();
        int trials = 0;
        StringBuilder guessedString = new StringBuilder();

        for (int i = 0; i < secretWord.length(); i++) {
            guessedString.append("_");
        }

        while (true) {
            System.out.print("Enter one character or your guess word: ");
            String input = scanner.nextLine();
            trials++;

            if (input.length() == 1) {
                char guessChar = input.charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guessChar) {
                        guessedString.setCharAt(i, guessChar);
                        correctGuess = true;
                    }
                }

                System.out.println("Trial " + trials + ": " + guessedString);

                if (!guessedString.toString().contains("_")) {
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials.");
                    break;
                }

                if (!correctGuess) {
                    System.out.println("Incorrect guess.");
                }
            } else {
                if (input.equals(secretWord)) {
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials.");
                    break;
                } else {
                    System.out.println("Incorrect guess.");
                }
            }
        }
    }
}

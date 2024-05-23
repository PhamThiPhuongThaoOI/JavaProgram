package Lap03.exs101;
import java.util.Scanner;
public class TestpalindromicWordandPhase {
    public static void main(String[] args) {
        testPalindromicWord();
        testPalindromicPhrase();
    }

    // Method to check if a word is palindromic
    public static boolean isPalindromicWord(String inStr) {
        inStr = inStr.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int length = inStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (inStr.charAt(i) != inStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to test palindromic word
    public static void testPalindromicWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        if (isPalindromicWord(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
        scanner.close();
    }

    // Method to check if a phrase is palindromic
    public static boolean isPalindromicPhrase(String inStr) {
        inStr = inStr.toLowerCase().replaceAll("[^a-z]", ""); // Remove non-letter characters and convert to lowercase
        int length = inStr.length();
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            while (!Character.isLetter(inStr.charAt(i))) {
                i++;
            }
            while (!Character.isLetter(inStr.charAt(j))) {
                j--;
            }
            if (inStr.charAt(i) != inStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // Method to test palindromic phrase
    public static void testPalindromicPhrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        if (isPalindromicPhrase(phrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome.");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome.");
        }
        scanner.close();
    }

}

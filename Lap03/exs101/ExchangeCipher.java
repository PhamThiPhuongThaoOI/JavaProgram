package Lap03.exs101;
import java.util.Scanner;
public class ExchangeCipher {
    public static void main(String[] args) {
        testExchangeCipher();
    }


    public static String exchangeCipher(String inStr) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char currentChar = inStr.charAt(i);
            if (Character.isLetter(currentChar)) {
                char cipherChar = (char) ('A' + 'Z' - currentChar);
                ciphertext.append(cipherChar);
            } else {
                ciphertext.append(currentChar);
            }
        }
        return ciphertext.toString();
    }


    public static void testExchangeCipher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plaintext = scanner.next().toUpperCase();
        String ciphertext = exchangeCipher(plaintext);
        System.out.println("The ciphertext string is: " + ciphertext);
        scanner.close();
    }
}

package Lap02;

import java.util.Scanner;

public class ReverseString {
    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter the string : ");
        String str = input.nextLine();
        reverseString(str);
    }
private static void reverseString( String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; --i) {
        reversed += str.charAt(i);
    }
    System.out.printf( " The reversed of the String \"%s\" is \"%s\".", str,reversed);
}
}

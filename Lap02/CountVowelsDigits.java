package Lap02;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main ( String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a string: ");
        String str = in.nextLine();
        countVowelsDigits(str);
    }
    private static void countVowelsDigits ( String str) {
        int vowels = 0, digits = 0;
        for ( int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if ( Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                if (ch =='a'|| ch=='e' || ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch == 'O'||ch =='U') {
                    vowels++;
            }
          }
        }
        System.out.printf( " The number of vowels is: %d.(%2f%%)\n", vowels, vowels *1.0/str.length()*100);

        System.out.printf( " Number of Digits : %d.(%2f%%)\n",digits, digits*1.0/str.length()*100);
    }



    }

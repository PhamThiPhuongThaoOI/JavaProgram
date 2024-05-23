package Lap01.ex02;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        double average = (UPPERBOUND + LOWERBOUND) / 2;
        System.out.println(" The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.printf(" The average is %.2f " , average);
    }
}


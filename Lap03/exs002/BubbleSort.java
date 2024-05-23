package Lap03.exs002;
import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true; // update flag
                }
            }
            n--;
        } while (swapped);
    }
    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 1, 5};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}

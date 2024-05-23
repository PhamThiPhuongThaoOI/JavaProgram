package Lap03.exs002;

public class RcursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) { // Terminating one-element list
            if (key == array[fromIdx]) return true;
            else return false; // not found
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) return true;
            else if (key < array[middleIdx]) toIdx = middleIdx;
            else fromIdx = middleIdx + 1;
            return binarySearch(array, key, fromIdx, toIdx); // recursive call
        }
    }
}

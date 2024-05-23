package midtermtest.exs01;

public class SelectionSort implements Sorter{
    double[] arr;
    boolean ascending;

    public SelectionSort( double[] arr, boolean ascending) {
        this.arr = arr;
        this.ascending = ascending;
    }
    @Override
    public void sort( double[] arr, boolean ascending) {
       if( ascending) {
           sortAscending(arr);
       }else {
           sortDescending(arr);
       }
    }
    private void sortAscending ( double[] arr) {
        int n = arr.length;
        for( int i = 0; i < n-1; i++) {
            int minIndex = i;
            for( int j = 0; j< n; j++) {
                if( arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    private void sortDescending( double[] arr) {
        int n = arr.length;
        for( int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for( int j = 0; j < n; j++) {
                if( arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

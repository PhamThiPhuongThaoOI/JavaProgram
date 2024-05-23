package midtermtest.exs01;

public class InsertionSort implements Sorter{
    double[] arr;
    boolean ascending;

    public InsertionSort(double[] arr, boolean ascending) {
        this.arr = arr;
        this.ascending = ascending;
    }
    @Override
    public void sort( double[] arr, boolean ascending) {
        if(ascending){
            sortAscending(arr);
        }else {
            sortDescending(arr);
        }
    }
    private void sortAscending( double[] arr) {
        int n = arr.length;
        for (int i = 1; i<n; i++){
            double key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j +1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    private void sortDescending( double[] arr) {
        int n = arr.length;
        for( int i = 1; i < n; i++) {
            double key  = arr[i] ;
            int j = i -1;
            while( j>=0 && arr[j] <key) {
                arr[j +1] = arr[j];
                j = j -1;
            }
            arr[j +1] = key;
        }
    }
}

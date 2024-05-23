package midtermtest.exs01;

public class BubbleSort implements Sorter {
    double[] arr;
    boolean ascending;

    public BubbleSort() {
        this.arr= arr;
        this.ascending = ascending;
    }
    @Override
    public void sort( double[] arr, boolean ascending ) {
      if(ascending) {
          sortAscending(arr);
      }else {
          sortDescending(arr);
      }
    }
    private void sortAscending( double[] arr) {
        int n = arr.length;

        for ( int i = 0; i < n-1; i++) {
            for( int j = 0; j< n-i-1; j ++) {
                if( arr[j] >arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    private void sortDescending( double[] arr) {
        int n = arr.length;
        for ( int i= 0; i < n-1; i++) {
            for( int j = 0; j < n -i-1; j++) {
                if( arr[j] <arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

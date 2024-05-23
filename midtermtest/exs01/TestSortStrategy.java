package midtermtest.exs01;

public class TestSortStrategy {

    public static void main(String[] args) {
        SortStrategy strategy = new SortStrategy();
        double[] arr = {3.5,1.2,4.7,2.0,5.1,6.3};

        System.out.println("Bubble Sort: ");
        System.out.print("Before sorting: ");
        print(arr);
        System.out.print("\nAfter sorting: ");
        Sorter sorter =  new BubbleSort();
        strategy.setSorter(sorter);
        strategy.sort(arr, true);
        print(arr);
        System.out.println();

        System.out.println("Insertion Sort: ");
        System.out.print("Before sorting: ");
        print(arr);
        System.out.print("\nAfter sorting: ");
        Sorter sorter1 =  new InsertionSort(arr, true);
        strategy.setSorter(sorter1);
        strategy.sort(arr, true);
        print(arr);
        System.out.println();

        System.out.println("Selection Sort: ");
        System.out.print("Before sorting: ");
        print(arr);
        System.out.print("\nAfter sorting: ");
        Sorter sorter2 =  new SelectionSort(arr, true);
        strategy.setSorter(sorter2);
        strategy.sort(arr, true);
        print(arr);
    }

    public static void print(double[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}

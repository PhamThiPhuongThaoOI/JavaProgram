package midtermtest.exs01;

public class SortStrategy {
    protected SortStrategy instance;
    protected Sorter sorter;

    protected SortStrategy() {
        this.instance = instance;
        this.sorter = sorter;
    }

    public SortStrategy getInstance() {
        return instance;
    }
    public SortStrategy setSorter(Sorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public void sort(double[] arr, boolean ascending) {
        if( sorter != null) {
            sorter.sort(arr, ascending);
        } else {
            System.out.println(" No sorter is set.");
        }
    }
}

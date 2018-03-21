package sorting;

public class Driver {
    public static void main(String[] args) {
        Comparable[] arr = {6, 17, 1, 8, 2, 9, 14};
        SortInterface algo = new SortingAlgorithms();
        algo.insertionSort(arr, 0, arr.length - 1, false);
        // create another array, test another range of indices, etc.
        // test other methods
        // FILL IN CODE

    }
}

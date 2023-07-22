package algorithms;

import utils.GetData;
import java.util.Arrays;
import java.lang.Thread;

public class QuickSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;

    public QuickSort() {
        this.array = new GetData().array();
        this.result = sort();
        showResult();
    }

    public QuickSort(int[] array) {
        this.array = array;
        sort();
    }
    public String sort() {
        int[] originalArray = this.array.clone();

        Thread sortingThread = new Thread(() -> {
            int arrLength = this.array.length;
            long start = System.currentTimeMillis();

            quick(this.array, 0, arrLength - 1);

            long end = System.currentTimeMillis();
            this.executionTime = end - start;
        });

        sortingThread.start();

        try {
            sortingThread.join(150_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (sortingThread.isAlive()) {
            sortingThread.interrupt();
            this.executionTime = 9999999L;
            this.swaps = 9999999L;
            return "\n\tQUICK SORT: " + "\nOriginal Array: " + Arrays.toString(originalArray)
                    + "\nSorting took more than 2 minutes and was terminated.";
        }

        return "\n\tQUICK SORT" + "\nOriginal Array: " + Arrays.toString(originalArray) +
                "\nSorted Array: " + Arrays.toString(this.array) + "\nand took: " + this.executionTime + " Millis";
    }

    private void quick(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quick(array, left, pivot);
            quick(array, (pivot + 1), right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int middle = (right + left) / 2;
        int pivot = array[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {
            do {
                i++;
            } while (array[i] < pivot);

            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }

            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            this.swaps++;
        }
    }

    public void showResult() {
        System.out.println(this.result);
    }

    public Long getExecutionTime() {
        return this.executionTime;
    }

    public Long getSwaps() {
        return this.swaps;
    }
}

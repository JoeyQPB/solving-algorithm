package algorithms;

import utils.GetData;
import java.util.Arrays;

public class QuickSort {
    private String result;
    private int[] arr;

    public QuickSort() {
        this.arr = new GetData().array();
        this.result = sort();
        showResult();
    }

    private String sort() {
        int arrLength = this.arr.length;
        int[] originalArray = this.arr.clone();

        long start = System.currentTimeMillis();

        quick(this.arr, 0,  arrLength - 1);

        long end = System.currentTimeMillis();

        return "\n\tQUICK SORT" + "\nOriginal Array: " + Arrays.toString(originalArray) +
                "\nSorted Array: " + Arrays.toString(this.arr) + "\nand took: " + (end - start) + " Millis";
    }

    static void quick(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quick(array, left, pivot);
            quick(array, (pivot + 1), right);
        }
    }

    static int partition(int[] array, int left, int right) {
        int middle = (int) (right + left) / 2;
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
        }
    }


    public void showResult() {
        System.out.println(this.result);
    }
}

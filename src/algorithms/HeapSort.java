package algorithms;

import utils.GetData;
import java.util.Arrays;

public class HeapSort {
    private String result;
    private int[] arr;
    public HeapSort () {
        this.arr = new GetData().array();
        this.result = sort();
        showResult();
    }

    private String sort() {
        int arrLength = this.arr.length;
        int[] originalArray = this.arr.clone();
        int[] arr2 = this.arr.clone();
        // el: 2*i + 1 (son1) and  2*i + 2 (son2) - binary tree

        long start = System.currentTimeMillis();

        for (int i =  (arrLength /  2 - 1); i >= 0; i--) {
            applyHeap(this.arr, arrLength, i);
        }

        for (int i = arrLength - 1; i > 0; i--) {
            int aux = this.arr[0];
            this.arr[0] = this.arr[i];
            this.arr[i] = aux;

            applyHeap(this.arr, i, 0);
        }

        long end = System.currentTimeMillis();

        for (int i =  (arrLength /  2 - 1); i >= 0; i--) {
            applyHeap(arr2, arrLength, i);
        }

        return "\n\tHEAP SORT" + "\nOriginal Array: " + Arrays.toString(originalArray) + "\nAlmost Sorted Array: " + Arrays.toString(arr2)
                + "\nSorted Array: " + Arrays.toString(this.arr) + "\nand took: " + (end - start) + " Millis";
    }

    public static void applyHeap(int[] array, int arrLength, int i) {
        int root = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < arrLength && array[left] > array[root]) {
            root = left;
        }

        if (right < arrLength && array[right] > array[root]) {
            root = right;
        }

        if (root != i) {
            int aux = array[i];
            array[i] = array[root];
            array[root] = aux;

            applyHeap(array, arrLength, root);
        }
    }

    public void showResult() {
        System.out.println(this.result);
    }
}

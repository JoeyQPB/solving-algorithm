package algorithms;

import utils.GetData;
import java.util.Arrays;

public class HeapSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;
    public HeapSort () {
        this.array = new GetData().array();
        this.result = sort();
        showResult();
    }

    public HeapSort(int[] array) {
        this.array = array;
    }

    public String sort() {
        int arrLength = this.array.length;
        int[] originalArray = this.array.clone();
        int[] arr2 = this.array.clone();
        // el: 2*i + 1 (son1) and  2*i + 2 (son2) - binary tree

        long start = System.currentTimeMillis();

        for (int i =  (arrLength /  2 - 1); i >= 0; i--) {
            applyHeap(this.array, arrLength, i);
        }

        for (int i = arrLength - 1; i > 0; i--) {
            int aux = this.array[0];
            this.array[0] = this.array[i];
            this.array[i] = aux;
            this.swaps++;
            applyHeap(this.array, i, 0);
        }

        long end = System.currentTimeMillis();

        this.executionTime = end - start;

        for (int i =  (arrLength /  2 - 1); i >= 0; i--) {
            applyHeap(arr2, arrLength, i);
        }

        return "\n\tHEAP SORT" + "\nOriginal Array: " + Arrays.toString(originalArray) + "\nAlmost Sorted Array: " + Arrays.toString(arr2)
                + "\nSorted Array: " + Arrays.toString(this.array) + "\nand took: " + this.executionTime + " Millis";
    }

    public void applyHeap(int[] array, int arrLength, int i) {
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
            this.swaps++;

            applyHeap(array, arrLength, root);
        }
    }

    public void showResult() {
        System.out.println(this.result);
    }

    public int[] getArray() {
        return this.array;
    }

    public Long getExecutionTime() {
        return this.executionTime;
    }

    public Long getSwaps() {
        return this.swaps;
    }
}

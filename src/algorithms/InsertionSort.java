package algorithms;

import utils.GetData;
import java.util.Arrays;

public class InsertionSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;

    public InsertionSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result =  sort();
        showResult();
    }

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public String sort() {
        int[] arrayCopy = this.array.clone();
        int aux, j;

        long start = System.currentTimeMillis();

        for (int i = 1; i < this.array.length; i++ ) {
            aux = this.array[i];
            j = i - 1;

            while ( j >= 0 && this.array[j] > aux ) {
                this.array[j + 1] = this.array[j];
                j--;
                this.swaps++;
            }
            this.array[j + 1] = aux;
            this.swaps++;
        }

        long end = System.currentTimeMillis();

        this.executionTime = end - start;

        return "\n\tINSERTION SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " +
                Arrays.toString(this.array) + "\nSorted Array: " + "\nand took: " + this.executionTime + " Millis";
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
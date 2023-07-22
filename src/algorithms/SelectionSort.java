package algorithms;

import utils.GetData;
import java.util.Arrays;

public class SelectionSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;
    public SelectionSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result =  sort();
        showResult();
    }

    public SelectionSort(int[] array) {
        this.array = array;
    }
    public String sort() {
        int[] arrayCopy = this.array.clone();
        int aux, minor_position;

        long start = System.currentTimeMillis();

        for(int i = 0; i < this.array.length; i++) {
            minor_position = i;
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[j] < this.array[minor_position]) {
                    minor_position = j;
                }
            }
            aux = this.array[minor_position];
            this.array[minor_position] = this.array[i];
            this.array[i] = aux;
            this.swaps++;
        }

        long end = System.currentTimeMillis();

        this.executionTime = end - start;

        return "\n\tSELECTION SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " +
                Arrays.toString(array) + "\nand took: " +  this.executionTime + " Millis";
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

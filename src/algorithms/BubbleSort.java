package algorithms;

import utils.GetData;
import java.util.Arrays;

public class BubbleSort {
    private String result;
    private int[] array;
    private Long executionTime;
    private Long swaps = 0L;

    public BubbleSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result = sort();
        showResult();
    }

    private String sort() {
        int[] arrayCopy = this.array.clone();
        int[] arr2 = this.array.clone();
        int temp;

        long start = System.currentTimeMillis();

        for (int i = 0; i < this.array.length; i++) {
            for (int j = i + 1; j < this.array.length ; j++) {
                if(this.array[i] > this.array[j]){
                    temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                    this.swaps++;
                }
            }
        }

        long end = System.currentTimeMillis();

        this.executionTime = end - start;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length ; j++) {
                if(arr2[i] < arr2[j]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        return "\n\tBUBBLE SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " + Arrays.toString(this.array) +
                "\nSorted Array: " + Arrays.toString(arr2) + "\nand took: " + this.executionTime + " Millis";
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

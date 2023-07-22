package algorithms;

import utils.GetData;
import java.util.Arrays;

public class ShellSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;

    public ShellSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result = sort();
        showResult();
    }

    public ShellSort(int[] array) {
        this.array = array;
    }
    public String sort() {
        int[] arrayCopy = this.array.clone();
        int h = 1,  element, j;
        int arrayLength = this.array.length;

        long start = System.currentTimeMillis();

        while (h < arrayLength) {
            h = h * 3 + 1;
        }
        h = (h/3);

        while (h > 0) {
            for ( int i = h; i < arrayLength; i++) {
                element = this.array[i];
                j = i;
                while (j >= h && this.array[j - h] > element) {
                    this.array[j] = this.array[j - h];
                    j = j - h;
                    this.swaps++;
                }
                this.array[j] = element;
                this.swaps++;
            }
            h = h / 2;
        }

        long end = System.currentTimeMillis();

        this.executionTime = end - start;

        return "\n\tBUBBLE SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " + Arrays.toString(this.array) +
                "\nand took: " + this.executionTime + " Millis";
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

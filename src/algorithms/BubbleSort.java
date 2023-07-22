package algorithms;

import utils.GetData;
import java.util.Arrays;
import java.lang.Thread;

public class BubbleSort {
    private String result;
    private final int[] array;
    private Long executionTime;
    private Long swaps = 0L;

    public BubbleSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result = sort();
        showResult();
    }

    public BubbleSort(int[] array) {
        this.array = array;
        sort();
    }

    public String sort() {
        int[] arrayCopy = this.array.clone();

        Thread sortingThread = new Thread(() -> {
            int temp;
            long start = System.currentTimeMillis();

            for (int i = 0; i < this.array.length; i++) {
                for (int j = i + 1; j < this.array.length; j++) {
                    if (this.array[i] > this.array[j]) {
                        temp = this.array[i];
                        this.array[i] = this.array[j];
                        this.array[j] = temp;
                        this.swaps++;
                    }
                }
            }

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
            return "\n\tBUBBLE SORT: " + "\nOriginal Array: " + Arrays.toString(arrayCopy)
                    + "\nSorting took more than 2 minutes and was terminated.";
        }

        return "\n\tBUBBLE SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: "
                + Arrays.toString(this.array) + "\nand took: " + this.executionTime + " Millis"
                + "\nand does: " + getSwaps() + " swaps";
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

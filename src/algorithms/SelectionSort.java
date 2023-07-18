package algorithms;

import utils.GetData;
import java.util.Arrays;

public class SelectionSort {
    private String result;
    private int[] array;
    public SelectionSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result =  sort();
        showResult();
    }

    private String sort() {
        int[] arrayCopy = this.array.clone();
        int[] arr2 = this.array.clone();
        int aux = 0, minor_position;

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
        }

        long end = System.currentTimeMillis();

        for(int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] < arr2[j]) {
                    aux = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = aux;
                }
            }
        }

        return "\n\tSELECTION SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " +
                Arrays.toString(array) + "\nSorted Array: " + Arrays.toString(arr2) + "\nand took: " + (end - start) + " Millis";
    }

    public void showResult() {
        System.out.println(this.result);
    }
}

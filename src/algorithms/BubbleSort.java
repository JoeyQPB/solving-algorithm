package algorithms;

import utils.GetData;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private String result;
    private int[] arr;

    public BubbleSort() {
        GetData getData = new GetData();
        this.arr = getData.array();
        this.result =  sort(this.arr);
        showResult();
    }

    private String sort(int[] array) {
        int[] arrayCopy = array.clone();
        int[] arr2 = array.clone();
        int temp;

        long start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        long end = System.currentTimeMillis();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length ; j++) {
                if(arr2[i] < arr2[j]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        return "\n\tBUBBLE SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " + Arrays.toString(array) +
                "\nSorted Array: " + Arrays.toString(arr2) + "\nand took: " + (end - start) + " Millis";
    }
    public void showResult() {
        System.out.println(this.result);
    }
}

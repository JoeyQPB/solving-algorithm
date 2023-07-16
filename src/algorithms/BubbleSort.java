package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private String result;
    public BubbleSort() {
        gettingData();
    }

    private void gettingData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the array length to be sorted: ");
        int[] arr = new int[Integer.parseInt(sc.nextLine())];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        this.result = sort(arr);
    }

    private String sort(int[] array) {
        int[] arrayCopy = array.clone();
        int[] arr2 = array.clone();
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length ; j++) {
                if(arr2[i] < arr2[j]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        return "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " + Arrays.toString(array) + "\nSorted Array: " + Arrays.toString(arr2);
    }

    public void showResult() {
        System.out.println(this.result);
    }
}

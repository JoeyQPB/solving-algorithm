package algorithms;
import utils.GetData;
import java.util.Arrays;

public class InsertionSort {
    private String result;
    private int[] array;
    public InsertionSort() {
        GetData getData = new GetData();
        this.array = getData.array();
        this.result =  sort();
    }

    private String sort() {
        int[] arrayCopy = this.array.clone();
        int[] arr2 = this.array.clone();
        int aux, j;

        long start = System.currentTimeMillis();

        for (int i = 1; i < this.array.length; i++ ) {
            aux = this.array[i];
            j = i - 1;

            while ( j >= 0 && this.array[j] > aux ) {
                this.array[j + 1] = this.array[j];
                j--;
            }
            this.array[j + 1] = aux;
        }

        long end = System.currentTimeMillis();

        for (int i = 1; i < arr2.length; i++ ) {
            aux = arr2[i];
            j = i - 1;

            while ( j >= 0 && arr2[j] < aux ) {
                arr2[j + 1] = arr2[j];
                j--;
            }
            arr2[j + 1] = aux;
        }

        return "\n\tINSERTION SORT" + "\nOriginal Array: " + Arrays.toString(arrayCopy) + "\nSorted Array: " +
                Arrays.toString(array) + "\nSorted Array: " + Arrays.toString(arr2) + "\nand took: " + (end - start) + " Millis";
    }

    public void showResult() {
        System.out.println(this.result);
    }
}
package algorithms;
import java.util.Scanner;

public class BinarySearch {
    private int start = 0;
    private int end = 0;
    private  int numberToFind;
    private String result;
    public BinarySearch(){
        getData();
    }

    private void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array that will be used in the search: ");
        this.end = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the number you would like to find: ");
        this.numberToFind = Integer.parseInt(sc.nextLine());

        this.result = search();
    }

    private String search(){
        double[] arr = new double[this.end + 1];
        int count = 0;

        for(int i = 0; i < this.end; i++){
            arr[i] = i;
        }

        while(this.start <= this.end) {
            int middle = (this.start + this.end) / 2;
            count++;

            if (arr[middle] == this.numberToFind) break;
            else if (this.numberToFind > middle) this.start = middle + 1;
            else this.end = middle - 1;
        }
        return "This took " + count + " searches to find " + numberToFind;
    }
    public void showResult(){
        System.out.println(this.result);
    }
}

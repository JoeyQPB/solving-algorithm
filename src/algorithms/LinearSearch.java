package algorithms;
import java.util.Scanner;
public class LinearSearch {
    private Integer arrLength;
    private Integer numberToFind;
    private String result;
    public LinearSearch(){
        gettingData();
    }
    private void gettingData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array that will be used in the search: ");
        this.arrLength = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the number you would like to find: ");
        this.numberToFind = Integer.parseInt(sc.nextLine());

        this.result = search();
        showResult();
    }

    private String search(){
        int[] arr = new int[this.arrLength];
        int attempts = 1;

        for (int i = 1; i < this.arrLength; i++) {
            arr[i] = i;
        }

        for (int number : arr) {
            if (number == this.numberToFind) break;
            attempts++;
        }

        if ( attempts > arrLength) {
            return "In a range from 1 to " + (this.arrLength - 1) + ", the number: " + this.numberToFind + " does not exist!";
        }

        return "After " + attempts + " attempts we found the number: " + this.numberToFind;
    }
    public void showResult() {
        System.out.println(this.result);
    }
}

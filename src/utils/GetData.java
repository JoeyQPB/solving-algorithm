package utils;

import java.util.Scanner;
public class GetData {
    public int[] array() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the array length to be sorted: ");
        int[] arr = new int[Integer.parseInt(sc.nextLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
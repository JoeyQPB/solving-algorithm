package utils;
import java.util.Scanner;
public class Start {
    public int pick(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """

                        Pick one:\s
                        \t1 - Fibonacci\s
                        \t2 - Linear Search\s
                        \t3 - Binary Search\s
                        \t4 - Bubble Sort\s
                        \t5 - Insertion Sort\s
                        \t6 - Selection Sort\s
                        \t7 - Heap Sort\s
                        \t8 - Quick Sort\s
                        \t9 - Shell Sort\s
                        \t10 - Compare Sorted Algorithms\s
                        """);

        return Integer.parseInt(sc.nextLine());
    }
}

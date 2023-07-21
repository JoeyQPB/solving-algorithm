package services;

import algorithms.*;

public class ExecutePick {

    public ExecutePick(int pick) {

        switch (pick) {
            case 1 -> new Fibonacci();
            case 2 -> new LinearSearch();
            case 3 -> new BinarySearch();
            case 4 -> new BubbleSort();
            case 5 -> new InsertionSort();
            case 6 -> new SelectionSort();
            case 7 -> new HeapSort();
            case 8 -> new QuickSort();
            case 9 -> new ShellSort();
            case 10 -> new CompareAlgorithms();

            default -> System.out.println("Invalid Option!");
        }

    }
}

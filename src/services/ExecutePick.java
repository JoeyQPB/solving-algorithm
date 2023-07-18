package services;

import algorithms.*;

public class ExecutePick {

    public ExecutePick(int pick) {

        switch (pick) {
            case 1 -> {
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.showResult();
            }
            case 2 -> {
                LinearSearch linearSearch = new LinearSearch();
                linearSearch.showResult();
            }
            case 3 -> {
                BinarySearch binarySearch = new BinarySearch();
                binarySearch.showResult();
            }
            case 4 -> {
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.showResult();
            }
            case 5 -> {
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.showResult();
            }
            case 6 -> {
                System.out.println("PICK 6");
            }
            default -> System.out.println("Invalid Option!");
        }

    }
}

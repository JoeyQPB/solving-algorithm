package services;

import algorithms.*;

public class CompareAlgorithms {
    public CompareAlgorithms() {
        StringBuilder sb = new StringBuilder();

        // 10
        int[] array_10 = new int[10];
        for( int i = 0; i < 10; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 100
        int[] array_100 = new int[10];
        for( int i = 0; i < 100; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 1000
        int[] array_1000 = new int[10];
        for( int i = 0; i < 1000; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 10000
        int[] array_10000 = new int[10];
        for( int i = 0; i < 10000; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 100000
        int[] array_100000 = new int[10];
        for( int i = 0; i < 100000; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 1000000
        int[] array_1000000 = new int[10];
        for( int i = 0; i < 1000000; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        sb.append("\n COMPARE \n");

        BubbleSort bubbleSort_10 = new BubbleSort(array_10);
        BubbleSort bubbleSort_100 = new BubbleSort(array_100);
        BubbleSort bubbleSort_1000 = new BubbleSort(array_1000);
        BubbleSort bubbleSort_10000 = new BubbleSort(array_10000);
        BubbleSort bubbleSort_100000 = new BubbleSort(array_100000);
        BubbleSort bubbleSort_1000000 = new BubbleSort(array_1000000);

        sb.append("Bubble Sort: \n\n" );

        SelectionSort selectionSort_10 = new SelectionSort(array_10);
        SelectionSort selectionSort_100 = new SelectionSort(array_100);
        SelectionSort selectionSort_1000 = new SelectionSort(array_1000);
        SelectionSort selectionSort_10000 = new SelectionSort(array_10000);
        SelectionSort selectionSort_100000 = new SelectionSort(array_100000);
        SelectionSort selectionSort_1000000 = new SelectionSort(array_1000000);

        sb.append("Selection Sort: \n\n" );

        InsertionSort insertionSort_10 = new InsertionSort(array_10);
        InsertionSort insertionSort_100 = new InsertionSort(array_100);
        InsertionSort insertionSort_1000 = new InsertionSort(array_1000);
        InsertionSort insertionSort_10000 = new InsertionSort(array_10000);
        InsertionSort insertionSort_100000 = new InsertionSort(array_100000);
        InsertionSort insertionSort_1000000 = new InsertionSort(array_1000000);

        sb.append("Insertion Sort: \n\n" );

        HeapSort heapSort_10 = new HeapSort(array_10);
        HeapSort heapSort_100 = new HeapSort(array_100);
        HeapSort heapSort_1000 = new HeapSort(array_1000);
        HeapSort heapSort_10000 = new HeapSort(array_10000);
        HeapSort heapSort_100000 = new HeapSort(array_100000);
        HeapSort heapSort_1000000 = new HeapSort(array_1000000);

        sb.append("Heap Sort: \n\n" );

        QuickSort quickSort_10 = new QuickSort(array_10);
        QuickSort quickSort_100 = new QuickSort(array_100);
        QuickSort quickSort_1000 = new QuickSort(array_1000);
        QuickSort quickSort_10000 = new QuickSort(array_10000);
        QuickSort quickSort_100000 = new QuickSort(array_100000);
        QuickSort quickSort_1000000 = new QuickSort(array_1000000);

        sb.append("Quick Sort: \n\n" );

        ShellSort shellSort_10 = new ShellSort(array_10);
        ShellSort shellSort_100 = new ShellSort(array_100);
        ShellSort shellSort_1000 = new ShellSort(array_1000);
        ShellSort shellSort_10000 = new ShellSort(array_10000);
        ShellSort shellSort_100000 = new ShellSort(array_100000);
        ShellSort shellSort_1000000 = new ShellSort(array_1000000);

        sb.append("Shell Sort: \n\n" );
    }
}

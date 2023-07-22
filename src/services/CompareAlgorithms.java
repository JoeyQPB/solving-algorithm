package services;

import algorithms.*;

public class CompareAlgorithms {
    public CompareAlgorithms() {
        StringBuilder sbTime = new StringBuilder();
        StringBuilder sbSwaps = new StringBuilder();


        // 10
        int[] array_10 = new int[10];
        for( int i = 0; i < 10; i++) {
            array_10[i] = (int) (Math.random() * 100);
        }

        // 100
        int[] array_100 = new int[100];
        for( int i = 0; i < 100; i++) {
            array_100[i] = (int) (Math.random() * 100);
        }

        // 1000
        int[] array_1000 = new int[1000];
        for( int i = 0; i < 1000; i++) {
            array_1000[i] = (int) (Math.random() * 100);
        }

        // 10000
        int[] array_10000 = new int[10000];
        for( int i = 0; i < 10000; i++) {
            array_10000[i] = (int) (Math.random() * 100);
        }

        // 100000
        int[] array_100000 = new int[100000];
        for( int i = 0; i < 100000; i++) {
            array_100000[i] = (int) (Math.random() * 100);
        }

        // 1000000
        int[] array_1000000 = new int[1000000];
        for( int i = 0; i < 1000000; i++) {
            array_1000000[i] = (int) (Math.random() * 100);
        }

        BubbleSort bubbleSort_10 = new BubbleSort(array_10);
        BubbleSort bubbleSort_100 = new BubbleSort(array_100);
        BubbleSort bubbleSort_1000 = new BubbleSort(array_1000);
        BubbleSort bubbleSort_10000 = new BubbleSort(array_10000);
        BubbleSort bubbleSort_100000 = new BubbleSort(array_100000);
        BubbleSort bubbleSort_1000000 = new BubbleSort(array_1000000);

        SelectionSort selectionSort_10 = new SelectionSort(array_10);
        SelectionSort selectionSort_100 = new SelectionSort(array_100);
        SelectionSort selectionSort_1000 = new SelectionSort(array_1000);
        SelectionSort selectionSort_10000 = new SelectionSort(array_10000);
        SelectionSort selectionSort_100000 = new SelectionSort(array_100000);
        SelectionSort selectionSort_1000000 = new SelectionSort(array_1000000);

        InsertionSort insertionSort_10 = new InsertionSort(array_10);
        InsertionSort insertionSort_100 = new InsertionSort(array_100);
        InsertionSort insertionSort_1000 = new InsertionSort(array_1000);
        InsertionSort insertionSort_10000 = new InsertionSort(array_10000);
        InsertionSort insertionSort_100000 = new InsertionSort(array_100000);
        InsertionSort insertionSort_1000000 = new InsertionSort(array_1000000);

        HeapSort heapSort_10 = new HeapSort(array_10);
        HeapSort heapSort_100 = new HeapSort(array_100);
        HeapSort heapSort_1000 = new HeapSort(array_1000);
        HeapSort heapSort_10000 = new HeapSort(array_10000);
        HeapSort heapSort_100000 = new HeapSort(array_100000);
        HeapSort heapSort_1000000 = new HeapSort(array_1000000);

        QuickSort quickSort_10 = new QuickSort(array_10);
        QuickSort quickSort_100 = new QuickSort(array_100);
        QuickSort quickSort_1000 = new QuickSort(array_1000);
        QuickSort quickSort_10000 = new QuickSort(array_10000);
        QuickSort quickSort_100000 = new QuickSort(array_100000);
        QuickSort quickSort_1000000 = new QuickSort(array_1000000);

        ShellSort shellSort_10 = new ShellSort(array_10);
        ShellSort shellSort_100 = new ShellSort(array_100);
        ShellSort shellSort_1000 = new ShellSort(array_1000);
        ShellSort shellSort_10000 = new ShellSort(array_10000);
        ShellSort shellSort_100000 = new ShellSort(array_100000);
        ShellSort shellSort_1000000 = new ShellSort(array_1000000);

        sbTime.append("\nCOMPARE TIME IN ML\t\t\t --10--\t\t\t --100--\t\t\t --1K--\t\t\t --10K--\t\t\t --100K--\t\t\t --1M--")
                .append("\nBubble Sort:\t\t\t")
                .append(bubbleSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(bubbleSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(bubbleSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(bubbleSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(bubbleSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(bubbleSort_1000000.getExecutionTime()).append(" -- \t\t\t")
                .append("\nSelection Sort:\t\t\t")
                .append(selectionSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(selectionSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(selectionSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(selectionSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(selectionSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(selectionSort_1000000.getExecutionTime()).append(" -- \t\t\t")
                .append("\nInsertion Sort:\t\t\t")
                .append(insertionSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(insertionSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(insertionSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(insertionSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(insertionSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(insertionSort_1000000.getExecutionTime()).append(" -- \t\t\t")
                .append("\nHeap Sort:  \t\t\t")
                .append(heapSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(heapSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(heapSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(heapSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(heapSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(heapSort_1000000.getExecutionTime()).append(" -- \t\t\t")
                .append("\nQuick Sort: \t\t\t")
                .append(quickSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(quickSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(quickSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(quickSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(quickSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(quickSort_1000000.getExecutionTime()).append(" -- \t\t\t")
                .append("\nShell Sort: \t\t\t")
                .append(shellSort_10.getExecutionTime()).append("  -- \t\t\t")
                .append(shellSort_100.getExecutionTime()).append(" -- \t\t\t")
                .append(shellSort_1000.getExecutionTime()).append(" -- \t\t\t")
                .append(shellSort_10000.getExecutionTime()).append(" -- \t\t\t")
                .append(shellSort_100000.getExecutionTime()).append(" -- \t\t\t")
                .append(shellSort_1000000.getExecutionTime()).append(" -- \t\t\t");



        sbSwaps.append("\nCOMPARE SWAPS\t\t--10--\t\t\t --100--\t\t\t --1K--\t\t\t --10K--\t\t\t --100K--\t\t\t --1M--")
                .append("\nBubble Sort:\t\t\t")
                .append(bubbleSort_10.getSwaps()).append(" -- \t\t\t")
                .append(bubbleSort_100.getSwaps()).append(" -- \t\t\t")
                .append(bubbleSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(bubbleSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(bubbleSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(bubbleSort_1000000.getSwaps()).append(" -- \t\t\t")
                .append("\nSelection Sort:\t\t\t")
                .append(selectionSort_10.getSwaps()).append(" -- \t\t\t")
                .append(selectionSort_100.getSwaps()).append(" -- \t\t\t")
                .append(selectionSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(selectionSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(selectionSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(selectionSort_1000000.getSwaps()).append(" -- \t\t\t")
                .append("\nInsertion Sort:\t\t\t")
                .append(insertionSort_10.getSwaps()).append(" -- \t\t\t")
                .append(insertionSort_100.getSwaps()).append(" -- \t\t\t")
                .append(insertionSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(insertionSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(insertionSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(insertionSort_1000000.getSwaps()).append(" -- \t\t\t")
                .append("\nHeap Sort:  \t\t\t")
                .append(heapSort_10.getSwaps()).append(" -- \t\t\t")
                .append(heapSort_100.getSwaps()).append(" -- \t\t\t")
                .append(heapSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(heapSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(heapSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(heapSort_1000000.getSwaps()).append(" -- \t\t\t")
                .append("\nQuick Sort: \t\t\t")
                .append(quickSort_10.getSwaps()).append(" -- \t\t\t")
                .append(quickSort_100.getSwaps()).append(" -- \t\t\t")
                .append(quickSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(quickSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(quickSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(quickSort_1000000.getSwaps()).append(" -- \t\t\t")
                .append("\nShell Sort: \t\t\t")
                .append(shellSort_10.getSwaps()).append(" -- \t\t\t")
                .append(shellSort_100.getSwaps()).append(" -- \t\t\t")
                .append(shellSort_1000.getSwaps()).append(" -- \t\t\t")
                .append(shellSort_10000.getSwaps()).append(" -- \t\t\t\t")
                .append(shellSort_100000.getSwaps()).append(" -- \t\t\t\t")
                .append(shellSort_1000000.getSwaps()).append(" -- \t\t\t");

        System.out.println(sbTime);
        System.out.println(sbSwaps);
    }
}

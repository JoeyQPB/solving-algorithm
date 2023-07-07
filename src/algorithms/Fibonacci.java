package algorithms;
import java.util.Scanner;
public class Fibonacci {
    private String result;
    public  Fibonacci(){
        gettingData();
    }
    private void gettingData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position to fibonacci: ");
        int position = Integer.parseInt(sc.nextLine());

        System.out.println("""
                Choose repeating loop type:\s
                \t1 - For
                \t2 - Function over function""");
        int choose = Integer.parseInt(sc.nextLine());

        if (choose == 1 ) forFibonacci(position);
        else if (choose == 2 ) functionOverFunctionFibonacci(position);
        else {
            System.out.println("Invalid option!");
            gettingData();
        }
    }
    private void forFibonacci(int position){
        long fibValue = 0;
        long a = 1;
        long b = 0;

        long startTime = System.nanoTime();

        for (int i = 1; i < position; i++) {
            fibValue = a + b;
            b = a;
            a = fibValue;
        }

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        this.result =   "\n\tFibonacci - in " + position + " - is: " + fibValue +
                        "\n\tExecution time in nanoseconds: " + timeElapsed +
                        "\n\tExecution time in milliseconds: " + timeElapsed/1000000;
    }
    private void functionOverFunctionFibonacci(int position){
        long startTime = System.nanoTime();

        double fibValue = findFibNumber(position);

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        this.result =   "\n\tFibonacci - in " + position + " - is: " + fibValue +
                        "\n\tExecution time in nanoseconds: " + timeElapsed +
                        "\n\tExecution time in milliseconds: " + timeElapsed/1000000;
    }
    private double findFibNumber(int position) {
        if (position == 0) return 0;
        if (position == 1) return 1;
        return findFibNumber(position - 1) + findFibNumber(position - 2);
    }
    public String getResult() {
        return this.result;
    }

}

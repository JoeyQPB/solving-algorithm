package utils;
import java.util.Scanner;
public class Start {
    public int pick(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """

                        Pick one:\s
                        \t1 - Fibonacci\s
                        \t2 - \s
                        \t3 - \s
                        \t4 - """);

        return Integer.parseInt(sc.nextLine());
    }
}

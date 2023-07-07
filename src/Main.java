import algorithms.*;
import utils.Start;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start start = new Start();
        int pick;

        System.out.println("\nHi there, I will solve some algorithms for you!");

        do {
            pick = start.pick();

            switch (pick) {
                case 1 -> {
                    Fibonacci fibonacci = new Fibonacci();
                    System.out.println(fibonacci.getResult());
                }
                case 2 -> {
                    System.out.println("your choice was 2");
                    System.out.println("your choice was 2");
                }
                default -> System.out.println("Invalid Option!");
            }

            System.out.println("\nDid you try again? (y/n)");
        } while (sc.nextLine().trim().equalsIgnoreCase("Y"));

        sc.close();
        System.out.println("\nBye!!");
    }
}
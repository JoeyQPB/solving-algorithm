import utils.Start;
import services.ExecutePick;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start start = new Start();
        int pick;

        System.out.println("\nHi there, I will solve some algorithms for you!");

        do {
            pick = start.pick();
            new ExecutePick(pick);
            System.out.println("\nDid you wanna try again? (y/n)");
        } while (sc.nextLine().trim().equalsIgnoreCase("Y"));

        sc.close();
        System.out.println("\nBye!!");
    }
}
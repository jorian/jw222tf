package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        System.out.print("How many hours? ");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        System.out.print("How many minutes? ");
        int minutes = sc.nextInt();
        System.out.print("How many seconds? ");
        int seconds = sc.nextInt();

        System.out.println("\nThis converts to " + ((hours * 3600) + (minutes * 60) + seconds) + " seconds.");

        sc.close();
    }
}

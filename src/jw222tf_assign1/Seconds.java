package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        System.out.print("How many hours? ");
        Scanner hoursIn = new Scanner(System.in);
        int hours = hoursIn.nextInt();
        System.out.print("How many minutes? ");
        Scanner minutesIn = new Scanner(System.in);
        int minutes = minutesIn.nextInt();
        System.out.print("How many seconds? ");
        Scanner secondsIn = new Scanner(System.in);
        int seconds = secondsIn.nextInt();

        System.out.println("\nThis converts to " + ((hours * 3600) + (minutes * 60) + seconds) + " seconds.");
    }
}

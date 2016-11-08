package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.print("Please enter the amount of seconds: ");
        Scanner secondsIn = new Scanner(System.in);
        int seconds = secondsIn.nextInt();

        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60; //(seconds - (hours * 3600)) / 60;
        seconds = remainder % 60; //(seconds - (minutes * 60) - (hours * 3600));

        System.out.println("This converts to " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");

        secondsIn.close();
    }
}

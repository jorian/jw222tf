package jw222tf_assign1;

/**
 * Created by Jorian on 3-11-2016.
 */
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the amount of Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
        System.out.printf(fahrenheit + " °F converts to %.1f", celsius);
        System.out.print(" °C.");

        sc.close();
        // It is not only Swedes who suffer from the different use of commas and dots...
    }
}
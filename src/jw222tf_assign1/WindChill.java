package jw222tf_assign1;

import java.util.Scanner;

/**
 * Created by Jorian on 3-11-2016 at 22:08.
 */
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give the temperature in degrees Celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Please give the wind speed in m/s: ");
        double windSpeed = sc.nextDouble();

        double windChill = 33 + (celsius - 33) * (0.474 + 0.454 * Math.sqrt(windSpeed) - 0.0454 * windSpeed);
        System.out.printf("The wind chill is: %.1f", windChill);
    }
}

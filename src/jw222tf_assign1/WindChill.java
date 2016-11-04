package jw222tf_assign1;

import java.util.Scanner;

/**
 * Created by Jorian on 3-11-2016 at 22:08.
 */
public class WindChill {
    public static void main(String[] args) {
        System.out.print("Please give the temperature in degrees Celsius: ");
        Scanner celsiusInput = new Scanner(System.in);
        double celsius = celsiusInput.nextDouble();
        System.out.print("Please give the wind speed in m/s: ");
        Scanner windSpeedInput = new Scanner(System.in);
        double windSpeed = windSpeedInput.nextDouble() * 3.6;

        double windChill = 13.12 + 0.6215 * celsius - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * celsius * Math.pow(windSpeed, 0.16);
                //33 + (celsius - 33) * (0.474 + (0.454 * Math.sqrt(windSpeed - 0.0454 * windSpeed) //((10*Math.sqrt(windSpeed)) - windSpeed + 10.5) * (33 - celsius);
        System.out.println("The wind chill is: " + windChill);
    }
}

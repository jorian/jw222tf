package jw222tf_assign1;

import java.util.Scanner;

/**
 * Created by Jorian on 3-11-2016 at 22:08.
 */
public class WindChill {
    public static void main(String[] args) {
        System.out.print("Please give the temperature in degrees Celsius: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.print("Please give the wind speed in m/s: ");
        double windSpeed = sc.nextDouble() * 3.6;

        //if the data on the assignments page is entered on the website given as resource for the Siple formula,
        //the given wind speed 8,4 and temperature -7,8 result in a apparent temperature of -23,8. That's when I
        //went looking in the source code, where a whole other formula is used:
        double windChill = (0.045*(5.27*Math.sqrt(windSpeed)+10.45-0.28*windSpeed)*(celsius-33)+33);

        System.out.printf("The wind chill is: %.1f", windChill);
    }
}

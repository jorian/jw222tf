package jw222tf_assign1;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Jorian on 3-11-2016 at 21:40.
 */
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first coordinates: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y-coordinate of the first coordinates: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the x-coordinate of the second coordinates: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y-coordinate of the second coordinates: ");
        int y2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x1-x2, 2.0) + Math.pow(y1-y2, 2.0)); // (double(x2-x1)^2 + (y2-y1)^2);
        System.out.printf("Value: %.3f", distance);

        sc.close();
    }
}



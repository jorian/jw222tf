package jw222tf_assign1;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Jorian on 3-11-2016 at 21:40.
 */
public class Distance {
    public static void main(String[] args) {
        System.out.print("Enter the x-coordinate of the first coordinates: ");
        Scanner x1Input = new Scanner(System.in);
        int x1 = x1Input.nextInt();
        System.out.print("Enter the y-coordinate of the first coordinates: ");
        Scanner y1Input = new Scanner(System.in);
        int y1 = y1Input.nextInt();
        System.out.print("Enter the x-coordinate of the second coordinates: ");
        Scanner x2Input = new Scanner(System.in);
        int x2 = x2Input.nextInt();
        System.out.print("Enter the y-coordinate of the second coordinates: ");
        Scanner y2Input = new Scanner(System.in);
        int y2 = y2Input.nextInt();

        double distance = Math.sqrt(Math.pow(x1-x2, 2.0) + Math.pow(y1-y2, 2.0)); // (double(x2-x1)^2 + (y2-y1)^2);
        System.out.printf("Value: %.3f", distance);
    }
}



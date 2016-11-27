package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 14:26.
 */
public class SecondLargest{
    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner sc = new Scanner(System.in);
        int numbers, max = 0, secondMax = 0;

        for (int i = 0;i<10;i++){
            numbers = sc.nextInt();
            if (numbers > max) {
                secondMax = max;
                max = numbers;
            }
            else if (numbers > secondMax) { //To account for numbers between current secondMax and max.
                secondMax = numbers;
            }
        }
        System.out.println("The second largest number: " + secondMax);
    }
}
package jw222tf_assign2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jorian on 13-11-2016 at 15:55.
 */
public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check: ");
        int input = sc.nextInt();
        int random = rand.nextInt(99);
        int tries = 1;

        while (input != random) {
            tries++;
            if (input > random) {
                System.out.println("lower");
            }
            else {
                System.out.println("higher");
            }
            System.out.print("Please enter a number to check: ");
            input = sc.nextInt();
        }
        System.out.println("The correct number is indeed: " + random + ". Guessed correctly after " + (tries) + " tries!");
    }
}

//Actually, if the user is smart, he doesn't need a limit at 10 tries. He can always guess a number < 100 within 10 tries.
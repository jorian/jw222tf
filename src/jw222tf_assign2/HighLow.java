package jw222tf_assign2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jorian on 13-11-2016 at 15:55.
 */
public class    HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Please enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int random = rand.nextInt(100) + 1;
        int tries = 1;
        int input = sc.nextInt();

        System.out.println(random);
        while (true) {
            if (tries <= 10) {
                tries++;
                if (input > random) {
                    System.out.println("lower");
                } else if (input < random) {
                    System.out.println("higher");
                } else {
                    System.out.println("The correct number is indeed: " + random + ". Guessed correctly after " + (tries - 1) + " tries!");
                    break;
                }
                System.out.print("Please enter a number to check: ");
                input = sc.nextInt();
            } else {
                System.out.println("You failed to guess within 10 times.");
                break;
            }
        }
    }
}

//Actually, a limit to 10 isn't needed. if the user is smart, he can always guess a number < 100 within 10 tries.
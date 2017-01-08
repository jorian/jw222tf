package jw222tf_assign4.drunkard;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Jorian on 6-1-2017 at 12:31.
 */
public class DrunkenWalk {
    public static void main(String args[]) {
        int fellIntoWater = 0;

        /*
        Found this: http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        to automatically close the scanner at the end of the statement.

        Each input is checked if input is integer and if input is positive. (is this a correct way to handle this?)
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            int sizeOfPlatform = 0;
            try {
                sizeOfPlatform = sc.nextInt();
            } catch (InputMismatchException e) {
                e.getMessage();
            }
            if (sizeOfPlatform <= 0) {
                throw new Exception("Size of platform should be a positive integer.");
            }

            System.out.print("Enter the number of steps: ");
            int maxSteps = 0;
            try {
                maxSteps = sc.nextInt();
            } catch (InputMismatchException e) {
                e.getMessage();
            }
            if (maxSteps <= 0) {
                throw new Exception("The maximum number of steps should be a positive integer.");
            }

            System.out.print("Enter the number of walks: ");
            int partyPeople = 0;
            try {
                partyPeople = sc.nextInt();
            } catch (InputMismatchException e) {
                e.getMessage();
            }
            if (partyPeople <= 0) {
                throw new Exception("The number of walks should be a positive integer.");
            }

            for (int i = 0; i < partyPeople; i++) {
                RandomWalk drunk = new RandomWalk(maxSteps, sizeOfPlatform);
                drunk.walk();
                if (!drunk.inBounds()) {
                    fellIntoWater++;
                }
                System.out.println(drunk.toString());
            }

            System.out.printf("Out of %d people, %d (%.2f%%) fell into the water.",
                    partyPeople, fellIntoWater, ((double) fellIntoWater / partyPeople * 100));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

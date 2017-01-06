package jw222tf_assign4.drunkard;

import java.util.Scanner;

/**
 * Created by Jorian on 6-1-2017 at 12:31.
 */
public class DrunkenWalk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int sizeOfPlatform = sc.nextInt();
        System.out.print("\nEnter the number of steps: ");
        int maxSteps = sc.nextInt();
        System.out.print("\nEnter the number of walks: ");
        int partyPeople = sc.nextInt();
        int fellIntoWater = 0;

        for (int i = 0; i < partyPeople; i++) {
            RandomWalk drunk = new RandomWalk(maxSteps, sizeOfPlatform);
            drunk.walk();
            if (!drunk.inBounds()) {
                fellIntoWater++;
            }
        }
        System.out.printf("Out of %d people, %d (%.2f%%) fell into the water.",
                partyPeople, fellIntoWater, ((double) fellIntoWater / partyPeople * 100));
    }
}

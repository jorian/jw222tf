package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 13-11-2016 at 14:35.
 */
public class CountA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aBig = 0, aSmall = 0;
        String s;

        System.out.print("Please enter a string text: ");
        String lineText = sc.nextLine();
        sc.close();

        for (int k = 0; k < lineText.length(); k++) {
            s = String.valueOf(lineText.charAt(k));
            switch (s) {
                case "A":
                    aBig++;
                    break;
                case "a":
                    aSmall++;
                    break;
            }
        }
        System.out.println("The number of A's: " + aBig);
        System.out.println("The number of a's: " + aSmall);

    }
}
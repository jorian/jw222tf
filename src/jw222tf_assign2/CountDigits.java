package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 15:09.
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large, positive integer: ");

        // To account for LONG integers, I use the long instead of int. Still, very large numbers do not work properly.
        // For that, BigNumber package should be used.
        long arbitraryNumber = sc.nextLong();
        int temp, zero=0, even=0, odd=0;

        //I first convert the integer value to a string, in order to iterate through the numbers separately:
        String numbers = String.valueOf(arbitraryNumber);
        sc.close();

        // Only start the iteration if the integer is positive:
        if (arbitraryNumber > 0) {
            for (int i=0;i<numbers.length();i++) {
                /*
                I have to account for the '0' in order to have the correct number. The char '0' casted to an integer
                actually is 48. So a '1' will be 49, a '2' will be 50.
                I basically cast the character to an integer this way. Found on stackoverflow.
                */
                temp = numbers.charAt(i) - '0';
                if (temp == 0) {
                    zero++;
                } else if (temp%2==0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.print("Zeros: \t"+zero+"\nOdds: \t"+odd+"\nEvens:\t"+even);
        } else {
            System.out.println("This integer is not positive. Please correct.");
        }
    }
}
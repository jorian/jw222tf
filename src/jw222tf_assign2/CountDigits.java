package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 15:09.
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large, positive integer: ");

        int temp, zero=0, even=0, odd=0, arbitraryNumber = sc.nextInt();
        String numbers = String.valueOf(arbitraryNumber);
        sc.close();

        if (arbitraryNumber > 0) {
            for (int i=0;i<numbers.length();i++) {
                temp = numbers.charAt(i);
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
package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 15:09.
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large, positive integer: ");
        String numbers = sc.nextLine();
        int temp=0,zero=0, odd=0, even=0;

        for(int i = 0;i < numbers.length();i++) {
            temp = (numbers.charAt(i) - '0');
            if (temp == 0) {
                zero++;
            } else if(temp%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Zeros: \t"+zero+"\nOdds: \t"+odd+"\nEvens:\t"+even);
    }
}

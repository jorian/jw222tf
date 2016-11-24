package jw222tf_assign2;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by Jorian on 13-11-2016 at 15:30.
 */
public class LargestK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int k=0,l=0, input = sc.nextInt();

        while(((k + (l + 2)) < input)) {
            l += 2;
            k += l;
        }
        System.out.println("The largest K such that 0+2+4+6+...+K < " + input + " => K=" + l);
    }
}
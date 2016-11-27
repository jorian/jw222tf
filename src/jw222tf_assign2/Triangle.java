package jw222tf_assign2;

import java.util.Scanner;

//THIS IS GOING TO BE TEST STUFF

/**
 * Created by Jorian on 15-11-2016 at 13:44.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an odd integer: ");
        int input = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int count = 0, position;

        if ((input%2) != 0) {
            // First I create a simple string with spaces, with input as its length.
            for (int i = 0; i <= input; i++) {
                sb.append(" ");
            }

            // Then I start at the end of that string and replace the spaces one by one with an asterisk.
            for (int i = (input); i > 0; i--) {
                sb.replace(i - 1, i, "*");
                System.out.println(sb);
            }
            System.out.println("\nIsosceles triangle:");
            // This is the first line of the Isosceles triangle. I again make a string with input as its length,
            // but this time if the iteration is equal to input divided by 2, I place an asterisk, as center of the triangle.
            for (int i = 0; i < input; i++) {
                if (i == input / 2) {
                    sb2.append("*");
                } else {
                    sb2.append(" ");
                }
            }

            // Here I start an iteration, and replace the space with an a asterisk half way the string, + and - the iteration.
            System.out.println(sb2);
            for (int i = (input / 2) - 1; i >= 0; i--) {
                position = (input / 2);
                count++;
                sb2.replace((position + count), position + count + 1, "*");
                sb2.replace((position - count), position - count + 1, "*");
                System.out.println(sb2);
            }
        }
        else {
            System.out.println("The number is not an odd number.");
        }
    }
}
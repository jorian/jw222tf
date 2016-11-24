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
            for (int i = 0; i <= input; i++) {
                sb.append(" ");
            }
            for (int i = (input); i > 0; i--) {
                sb.replace(i - 1, i, "*");
                System.out.println(sb);
            }
            for (int i = 0; i < input; i++) {
                if (i == input / 2) {
                    sb2.append("*");
                } else {
                    sb2.append(" ");
                }
            }
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
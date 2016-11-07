package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the price to pay: ");
        double price = sc.nextDouble();
        System.out.print("Please enter the amount paid: ");
        double amount = sc.nextDouble();
        int remainder = (int) Math.round(amount - price);

        int kr1000 = remainder / 1000;
        remainder %= 1000;
        int kr500 = remainder / 500;
        remainder %= 500;
        int kr100 = remainder / 100;
        remainder %= 100;
        int kr50 = remainder / 50;
        remainder %= 50;
        int kr20 = remainder / 20;
        remainder %= 20;
        int kr10 = remainder / 10;
        remainder %= 10;
        int kr5 = remainder / 5;
        remainder %= 5;

        System.out.println(" Change: " + Math.round((amount - price)));
        System.out.println("1000 kr: " + kr1000);
        System.out.println(" 500 kr: " + kr500);
        System.out.println(" 100 kr: " + kr100);
        System.out.println("  50 kr: " + kr50);
        System.out.println("  20 kr: " + kr20);
        System.out.println("  10 kr: " + kr10);
        System.out.println("   5 kr: " + kr5);
        System.out.println("   1 kr: " + remainder);
    }
}
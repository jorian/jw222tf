package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        int sumOfThree = 0;

        System.out.print("Enter a three-digit number: ");
        Scanner threeDigitIn = new Scanner(System.in);
        String threeDigits = threeDigitIn.nextLine();

        for (int i = 0; i < threeDigits.length(); i++) {
            sumOfThree += Integer.valueOf(threeDigits.substring(i, i+1));
        }

        System.out.println(threeDigits.charAt(0) + " + " + threeDigits.charAt(1) + " + "
                         + threeDigits.charAt(2) + " = " + sumOfThree);

        threeDigitIn.close();
    }
}

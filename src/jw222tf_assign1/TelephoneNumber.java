package jw222tf_assign1;

import java.util.Random;

/**
 * Created by Jorian on 3-11-2016 at 21:37.
 */
public class TelephoneNumber {
    public static void main(String[] args) {
        Random digits = new Random();
        String telephoneNumber = "0704-" + String.format("%s", digits.nextInt(9) + 1);
        for (int i = 0; i < 5; i++) {
            telephoneNumber += String.format("%s", digits.nextInt(9));
        }

        System.out.println("Random telephone number: " + telephoneNumber);
    }
}

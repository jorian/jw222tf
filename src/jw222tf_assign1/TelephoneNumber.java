package jw222tf_assign1;

import java.util.Random;

/**
 * Created by Jorian on 3-11-2016 at 21:37.
 */
public class TelephoneNumber {
    public static void main(String[] args) {
        Random digits = new Random();
        String telephoneNumber = "0704-" + String.format("%s", digits.nextInt(900000) + 1);

        System.out.println("Random telephone number: " + telephoneNumber);
    }
}

package jw222tf_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class FrequencyTable {
    public static void main(String[] args) {
        Random rand = new Random();
        int diceValue;
        ArrayList intList = new ArrayList<>(Collections.nCopies(6,0)); //6);

        // Almost everywhere I look on the internet, I find type List instead of ArrayList.

        while(intList.size() < 6) intList.add(0);

        for (int i = 0; i<6000; i++) {
            diceValue = rand.nextInt(6);
            intList.set(diceValue, (int) intList.get(diceValue)+1);
        }

        for (int i=1; i<7; i++) {
            System.out.println(i + ": " + intList.get(i-1)); //Print 1. first array thingie.
        }
    }
}

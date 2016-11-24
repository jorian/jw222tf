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
        // Because there is a difference between the size and the capacity of an ArrayList, I need to add elements (of 0)
        // to the ArrayList. I can do this by using a for loop and set every element to 0, but I used a different
        // approach here to keep it nice.
        ArrayList intList = new ArrayList<>(Collections.nCopies(6,0));

        // Almost everywhere I look on the internet, I find type List instead of ArrayList.

        for (int i = 0; i<6000; i++) {
            diceValue = rand.nextInt(6); //Get a number between 0 and 5
            intList.set(diceValue, (int) intList.get(diceValue) + 1); //add the value to the correct ArrayList element.
        }

        for (int i=1; i<7; i++) {
            System.out.println(i + ": " + intList.get(i-1)); //Print 1. first array thingie.
        }
    }
}

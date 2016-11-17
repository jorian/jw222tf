package jw222tf_assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class FrequencyTable {
    public static void main(String[] args) {
        Random rand = new Random();
        int diceValue;
        ArrayList intList = new ArrayList<>(6);

        for (int i=0; i<6; i++)
            intList.add(i, 0);

        for (int i = 0; i<6000; i++) {
            diceValue = rand.nextInt(6);
            intList.set(diceValue, (int) intList.get(diceValue)+1);
        }
        System.out.println(intList);
    }
}

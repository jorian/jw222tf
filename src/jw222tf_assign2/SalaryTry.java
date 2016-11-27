package jw222tf_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class SalaryTry {
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give salaries. End with X");
        String inputText = sc.next();
        int median, half, average, gap, iter = 0;
        double sum = 0;

        try {
            while (inputText.matches("[0-9]+") | (!inputText.toLowerCase().equals("x"))) { //isalphanumeric
                intList.add(iter, Integer.valueOf(inputText));
                iter++;
                inputText = sc.next();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid sign. Please redo.");
        }
        sc.close();
        if (intList.size() > 0) {
            // sort the list in order to get the right median:
            Collections.sort(intList);

            //sum must be a double here, to prevent rounding problems when averaging later on.
            for (Integer anIntList : intList) {
                sum += anIntList;
            }

            /*
            calculate median correctly depending on odd or even size of array
            if size is uneven, the correct integer to use for median remains. e.g. 7 / 2 = 3.5, where 3 is the
            correct index.
            */
            half = intList.size() / 2;
            if (intList.size() > 0 && (intList.size() % 2) == 0) {
                median = (int) Math.round((intList.get(half - 1) + intList.get(half)) / 2.0);
            } else
                median = (intList.get(half));
            //average = (int) (sum) / intList.size(); // round this correctly
            average = (int) Math.round(sum / intList.size()); // round this correctly
            gap = intList.get(intList.size() - 1) - intList.get(0);
            System.out.println("Ordered set: " + intList + "\nMedian: " + median + "\nAverage: " + average
                    + "\nGap: " + gap);
        }
    }
}
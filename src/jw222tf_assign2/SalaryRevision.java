package jw222tf_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class SalaryRevision {
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give salaries. End with X");
        String inputText = sc.next();
        int sum = 0, median, half, average, gap, iter = 0;

        while (!inputText.toLowerCase().equals("x")) {
            intList.add(iter, Integer.valueOf(inputText));
            iter++;
            inputText = sc.next();
        }
        sc.close();

        // sort the list in order to get the right median:
        Collections.sort(intList);

        // calculate the sum of all the elements inside the array:
        //intList.stream().mapToInt(Integer::intValue).sum();

        for (Integer anIntList : intList) {
            sum += anIntList;
        }

        /*
        calculate median correctly depending on odd or even size of array
        if size is uneven, the correct integer to use for median remains. e.g. 7 / 2 = 3.5, where 3 is the
        correct index.
        */
        half = intList.size()/2;
        if ((intList.size() % 2) == 0) {
            median = (intList.get(half - 1) + intList.get(half)) / 2;
        } else
            median = (intList.get(half));
        average = Math.round(sum / intList.size()); // round this correctly
        gap = intList.get(intList.size() - 1) - intList.get(0);
        System.out.println("Ordered set: " + intList  + "\nMedian: " + median +"\nAverage: " + average
                            + "\nGap: " + gap);
    }
}

//22100 29800 27300 25400 23100 22300 x
//21700 28200 26300 25100 22600 22800 19900 X
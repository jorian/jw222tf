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
        System.out.println("Please give salary. End with X");
        String inputText = sc.next();
        int sum=0, median, average, iter = 0;

        while (!inputText.toLowerCase().equals("x")) {
            intList.add(iter, Integer.valueOf(inputText));
            iter++;
            inputText = sc.next();
        }
        Collections.sort(intList);
        sum = intList.stream().mapToInt(Integer::intValue).sum();
        average = sum / intList.size();
        System.out.println(intList +"\n" + average);
    }
}

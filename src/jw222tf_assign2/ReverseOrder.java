package jw222tf_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integers. End by entering a negative integer.");
        int temp, tries = 0;
        List<Integer> intList = new ArrayList<>();

        while(true){
            System.out.print("Integer " + (tries + 1) + ": ");
            temp = sc.nextInt();
            if (temp > 1) {
                intList.add(tries, temp);
                tries++;
            }
            else
                break;
        }
        sc.close();
        System.out.println(intList);
        Collections.reverse(intList); //I'm lazy.
        System.out.println(intList);
    }
}

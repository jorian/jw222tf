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
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // I do this 'while(true)', because in this case I wouldn't have to ask for 'temp' twice. Once inside the loop
        // and once before the loop starts, because temp is used in the condition.
        while(true){
            System.out.print("Integer " + (tries + 1) + ": ");
            temp = sc.nextInt();
            if (temp > 0) {
                intList.add(tries, temp);
                tries++;
            }
            else
                break;
        }
        sc.close();
        System.out.println(intList);
        Collections.reverse(intList); //I'm lazy. I could have used the Reverse.java thing here.
        System.out.println(intList);
    }
}

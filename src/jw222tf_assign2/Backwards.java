package jw222tf_assign2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Jorian on 13-11-2016 at 15:03.
 */
public class Backwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give a string text: ");
        String inputText = sc.nextLine();
        int i, len = inputText.length();

        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){ //this way the iteration starts at the end of the given string.
            dest.append(inputText.charAt(i));
        }
        System.out.println(dest); //printing a stringbuilder is ok, right? Or should I convert to string first?
        sc.close();
    }
}
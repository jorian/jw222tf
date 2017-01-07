package jw222tf_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/12/2016.
 */
public class CountChar {
    public static void main(String[] args) {
        Scanner in;
        /*
        This is, imho, a better way of handling exceptions than shown in Histogram.java. Now this function will exit just fine
        when the exception is caught. (without trying to run the program because a System.exit() is missing.)

        The scanner in, when no exceptions are encountered, is passed as a parameter to the letterCounter function, where
        calculations are done on the given text.

        Output is printed there as well.
         */
        try {
            in = new Scanner(new File("C:\\Users\\Jorian\\Desktop\\HistoryOfProgramming.txt"));
            letterCounter(in);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void letterCounter(Scanner in) {
        int upperCase = 0;
        int lowerCase = 0;
        int whiteSpace = 0;
        int others = 0;

        while (in.hasNext()) {
            String line = in.nextLine();
            whiteSpace++; // since nextLine consumes the newline character.

            for (int i = 0; i < line.length();i++) {
                char ch = line.charAt(i);
                if (Character.isLowerCase(ch)) {
                    lowerCase++;
                }
                else if (Character.isUpperCase(ch)) {
                    upperCase++;
                }
                else if (Character.isWhitespace(ch)) {
                    whiteSpace++;
                }
                else {
                    others++;
                }
            }
        }
        System.out.println("Uppercase: " + upperCase + "\nLowercase: " + lowerCase + "\nWhitespaces: " + whiteSpace +
                "\nOthers: " + others);

        in.close();
    }
}


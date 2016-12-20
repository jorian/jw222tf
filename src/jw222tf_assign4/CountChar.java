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
        try {
            in = new Scanner(new File("/Users/JorianWielink/Desktop/HistoryOfProgramming.txt"));
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


        while (in != null && in.hasNext()) {
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

        // My IntelliJ IDE suggested to assert 'in' to be not null. Maybe I overlooked it, but it can't be null in this
        // program, logically, right?
        assert in != null;
        in.close();
    }
}


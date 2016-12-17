package jw222tf_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/12/2016.
 */
public class CountChar {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("/Users/JorianWielink/Desktop/HistoryOfProgramming.txt"));
        int upperCase = 0;
        int lowerCase = 0;
        int whiteSpace = 0;
        int others = 0;


        while (in.hasNext()) {
            String line = in.nextLine();
            whiteSpace++; // since nextLine consumes the newline character.
            int i = 0;
            while (i < line.length()) {
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
                i++;
            }
        }
        System.out.println("Uppercase: " + upperCase + "\nLowercase: " + lowerCase + "\nWhitespaces: " + whiteSpace +
                "\nOthers: " + others);
    }
}


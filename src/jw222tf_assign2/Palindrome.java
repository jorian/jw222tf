package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 16:10.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string of text: ");
        String checkString, inputString = sc.nextLine();
        /*
        the regular expression \\P{L}+ removes everything from a string
        except for letters, including typical Swedish letters like ä, ö and é.
        */
        checkString = inputString.replaceAll("\\P{L}+", "");
        boolean palindrome = true; //Every string will be a palindrome, unless the code below proves otherwise.

        /*
        I tried to be as short as possible here, so I combined a couple of methods into one if-statement.
        I don't know if this is what you want to see by now, but I tried it and it worked right at the first time.
        I could have done it more stepwise, by first checking if it's a letter, adding it to a string, comparing
        the first and last characters by iterating through the new string.

        Also, I could have made a while statement which would stop the moment it knew the string wasn't
        a palindrome anymore, so it wouldn't have to do any useless things after knowing it wouldn't be a palindrome.
         */
        for (int i = 0; i < checkString.length() / 2; i++) {
            // By iterating through the string:
            // if the first letter of the string is NOT equals the last letter of the string,
            // Palindrome will become false.
            if (!String.valueOf(checkString.charAt(i)).toLowerCase().equals(
                    String.valueOf(checkString.charAt((checkString.length() - 1) - i)).toLowerCase())) { //maybe use isLetter(input)
                palindrome = false;
            }
        }
        System.out.println(palindrome ? "It is a palindrome!" : "NOT a palindrome.");
        System.out.println(checkString);
    }
}

// Some Dutch palindromes:

// 'De mooie zeeman nam Anna mee', zei oom Ed
// De racecar, Ed
// droomnepparterreserretrappenmoord

// or Swedish:
// Dromedaren Alpotto planerade mord
// Medan ammor tre i Floda nakna ses aga lam i Malaga ses ankan Adolf i ert rom mana dem
//"A1 n2%}=3N{[a]"

//(inputText.matches("[0-9]+") && )
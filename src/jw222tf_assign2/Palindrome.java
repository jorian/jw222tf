package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 16:10.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string of text: ");
        String inputString = sc.nextLine();
        inputString = inputString.replaceAll("\\W+","");
        boolean palindrome = true;

        for (int i = 0; i<inputString.length() / 2;i++) {
            if (!String.valueOf(inputString.charAt(i)).toLowerCase().equals(String.valueOf(inputString.charAt((inputString.length() - 1) - i)).toLowerCase())) {
                palindrome = false;
            }
        }
        System.out.println(palindrome ? "It is a palindrome!" : "NOT a palindrome.");
    }
}

// Some Dutch palindromes:

// 'De mooie zeeman nam Anna mee', zei oom Ed
// De racecar, Ed
// droomnepparterreserretrappenmoord

// or Swedish:
// Dromedaren Alpotto planerade mord
// Medan ammor tre i Floda nakna ses aga lam i Malaga ses ankan Adolf i ert rom mana dem
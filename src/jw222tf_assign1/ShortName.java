package jw222tf_assign1;

import java.util.Scanner;

/**
 * Created by Jorian on 3-11-2016.
 */
public class ShortName {
    public static void main(String[] args) {
        System.out.print("Please enter your first name: ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print(firstName.charAt(0) + ". " + lastName.substring(0,4));

        sc.close();

        /*
        If the last name has less than 4 characters, errors are given, because
        looking up a character at a position that doesn'TextAnalyzer exist, doesn'TextAnalyzer work.

        To fix, uncomment the following:
        */
  //      if(lastName.length() > 4) {
//            for(int i=0;i<4;i++) {
//                System.out.print(lastName.charAt(i));
  //          }
  //      } else {
  //          for(int j=0;j<lastName.length();j++) {
  //              System.out.print(lastName.charAt(j));
  //          }
//        }
    }
}


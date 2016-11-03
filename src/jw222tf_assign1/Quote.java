package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class Quote {
    public static void main(String[] args) {

        // Allows a user to enter text to convert to a quote (double quote around input)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text to convert to a quote: " );
        String quote = input.nextLine();
        System.out.println("\"" + quote + "\"");
    }
}
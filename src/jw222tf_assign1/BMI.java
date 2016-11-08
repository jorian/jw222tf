package jw222tf_assign1;

/**
 * Created by Jorian on 1-11-2016.
 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("Please enter your length (m,cm): "); //There should be a error catcher to prevent error about dots instead of comma
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        System.out.print("Please enter your weight in kilograms: "); //Same here. if doubles were entered, round doubles to ints first.
        double weight = sc.nextDouble();

        double bmi = weight / (length * length));
        System.out.println("Your BMI is: " + Math.round(bmi));
    }
}

package jw222tf_assign2;

import java.util.Scanner;

/**
 * Created by Jorian on 15-11-2016 at 14:26.
 */
public class SecondLargest{
    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner sc = new Scanner(System.in);
        int numbers, max = 0, secondMax = 0;

        for (int i = 0;i<10;i++){
            numbers = sc.nextInt();
            if (numbers > max) {
                secondMax = max;
                max = numbers;
            }
            else if (numbers > secondMax) { //To account for numbers between current secondMax and max.
                secondMax = numbers;
            }
        }
        System.out.println("The second largest number: " + secondMax);
    }
}

// -150 200 645 5637 3423 846 20 1556 -980 5
// 67 -468 36 1345 -7778 0 34 7654 45 -666
// 1 2 3 4 5 6 7 8 9 10
// 10 9 8 7 6 5 4 3 2 1
// 5 4 6 3 7 2 8 1 9 10
// 5 6 7 8 9 10 1 2 3 4
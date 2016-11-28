package jw222tf_assign3;

import java.util.ArrayList;

/**
 * Created by Jorian on 27-11-2016 at 15:46.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8};
        System.out.println(sum(array));

        String str = toString(array);
        System.out.println("n = " + str);

        str = toString(addN(array, 2));
        System.out.println("n = " + str);

        Arrays.toString(array);

    }
    private static int sum(int[] arr) {
        int added = 0;
        for (int i = 0;i < arr.length;i++) {
            added += arr[i];
        }
        return added;
    }

    public static String toString(int[] arr){
        StringBuilder text = new StringBuilder();
        for (int anArr : arr) {
            text.append(anArr + ", ");
        }
        text.replace(text.length() - 2, text.length(), "");
        return String.valueOf(text);
    }

    private static int[] addN(int[] arr, int n) {
        int[] tempNumbers = arr;
        for (int i = 0; i<tempNumbers.length; i++) {
            tempNumbers[i] += n;
        }
        return tempNumbers;
    }

    private static int[] reverse(int[] arr) { //does it really change arr if i use the tip provided?
        int[] reversedArr = arr;
        int left = 0, right = reversedArr.length;
        for (int i = reversedArr.length; i == 0; i--) {
            int temp = reversedArr[left];
            reversedArr[left] = reversedArr[right];
            reversedArr[right] = temp;
        }
        return reversedArr;
    }

}

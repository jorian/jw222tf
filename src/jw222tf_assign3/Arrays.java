package jw222tf_assign3;

import java.util.ArrayList;

/**
 * Created by Jorian on 27-11-2016 at 15:46.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 1, 2, 3, 5, 1, 6, 7, 8};
        System.out.println(sum(array));

        String str = toString(array);
        System.out.println("n = " + str);

        //str = toString(addN(array, 2));
        //System.out.println("n = " + str);

        Arrays.toString(array);

        int[] subarray = {1, 2, 3};
        System.out.println(hasSubsequence(array, subarray));

        System.out.println(toString(sort(array)));

    }

    private static int sum(int[] arr) {
        int added = 0;
        for (int i = 0; i < arr.length; i++) {
            added += arr[i];
        }
        return added;
    }

    public static String toString(int[] arr) {
        StringBuilder text = new StringBuilder();
        for (int anArr : arr) {
            text.append(anArr + ", ");
        }
        text.replace(text.length() - 2, text.length(), "");
        return String.valueOf(text);
    }

    private static int[] addN(int[] arr, int n) {
        int[] tempNumbers = arr;
        for (int i = 0; i < tempNumbers.length; i++) {
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
            left++;
            right--;
        }
        return reversedArr;
    }

    private static boolean hasN(int[] arr, int n) {
        boolean hasN = false;
        for (int anArr : arr) {
            if (anArr == n) {
                hasN = true;
            }
        }
        return hasN;
    }

    private static void replaceAll(int[] arr, int old, int nw) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = nw;
            }
        }
    }

    private static int[] sort(int[] arr) {
        int[] temp = arr;
        for(int i=0;i <= temp.length-1;i++) {
            for(int j=0;j <= temp.length-2;j++) {
                if(temp[j] > temp[j + 1]) {
                    int tempint = 0;
                    tempint = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = tempint;
                }
            }
        }
        return temp;
    }


    private static boolean hasSubsequence(int[] arr, int[] sub) {
        /*
        First a for-loop is initiated in order to find the first occurrence of the sub array in the main array.
        When that happens, a new for-loop is initiated. In this for loop, a check is done if each element of the
        sub array is the same as the consecutive elements in the main array. Since it is known where the first occurrence of the
        first element of the sub array is found in the main array, the 'i' in main array is added with the 'j'
        of the sub array to get a synchronous iteration in both arrays, in order to check for equalness.

        If the two elements are the same, a counter gets a + 1. If, after checking each element, the counter has the same
        size as the length of the sub array, the sub array must be present in the main array.
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sub[0]) {
                int correct = 0;
                for (int j=0;j<sub.length;j++) {
                    if (arr[i + j] == sub[j]) {
                        correct++;
                    }
                }
                if (correct == sub.length){
                    return true;
                }
            }
        }
        return false;
    }
}

package jw222tf_assign2;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class Reverse {
    public static void main(String [] args) {
        int left, right;
        char temp;
        char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ',
                's', 'i', 'h', 'T' };

        for (char c : text) {
            System.out.print(c);
        }

        right = text.length - 1;
        for (left = 0;left<right;left++,right--) { //two iterations in 1 for-loop.
            temp = text[left];
            text[left] = text[right];
            text[right] = temp;
        }

        System.out.println(); //to put the two below each other.

        for (char c : text) {
            System.out.print(c);
        }
    }
}

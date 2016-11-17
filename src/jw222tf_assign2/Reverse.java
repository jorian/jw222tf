package jw222tf_assign2;

/**
 * Created by JorianWielink on 17/11/2016.
 */
public class Reverse {
    public static void main(String [] args) {
        char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ',
                's', 'i', 'h', 'T' };

        for (int i=0;i<text.length;i++) {
            System.out.print(String.valueOf(text[i]));
        }

        char temp;
        int left, right;
        right = text.length - 1;
        for (left = 0;left<right;left++,right--) {
            temp = text[left];
            text[left] = text[right];
            text[right] = temp;
        }
        System.out.println();

        for (char c : text) {
            System.out.print(c);        }


        // Continue here ...
    }
}

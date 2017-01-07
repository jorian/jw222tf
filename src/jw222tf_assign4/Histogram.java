package jw222tf_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/12/2016.
 */
public class Histogram {
    //Should I handle exceptions myself here?
    public static void main(String[] args) throws IOException {
        File inputFile = new File(args[0]);
        Scanner in = new Scanner(inputFile);

        int[] groupCollection = new int[10];
        int max = 0;
        int outsideRange = 0;
        int insideRange = 0;
        int nIntegers = 0;

        /*
        Start a while loop to go through each line. Stops when no integer is found on the next line.
         */
        while (in.hasNextInt()) {
            int next = in.nextInt();
            int group;

            /*
            If integer is in interval [1, 100], a counter is accumulated.
            Also, the integers are divided into groups by dividing them with 10, resulting in integers always rounded down
            to the nearest integer,
            in order to accumulate the corresponding element in the groupCollection array with 1.
            Else, an outside range counter will be accumulated with 1.
            */
            if (next > 0 && next <= 100) {
                insideRange++;
                group = (next - 1) / 10;
                groupCollection[group] = (groupCollection[group] + 1);
            } else {
                outsideRange++;
            }
            nIntegers++;
        }
        in.close();

        // Determine the highest value of the array, for Format to work in the end.
        for (int aGroupCollection : groupCollection) {
            if (aGroupCollection > max) {
                max = aGroupCollection;
            }
        }

        /*
        This part prints the actual hologram. First I iterate through the array groupCollection.
        For every element in this array, a Stringbuilder is appended with the integer found in the groupCollection element.
         */
        System.out.println("Reading " + nIntegers + " integers from file: " + inputFile + "\nInside range: " + insideRange +
                "\nOthers: " + outsideRange + "\n");
        for (int i = 0; i < groupCollection.length; i++) {
            StringBuilder stars = new StringBuilder();
            for (int j = 0; j < groupCollection[i]; j++) {
                stars.append("* ");
            }
            System.out.format("%-2d - %-3d  | %-" + max + "s\n", ((i + 1) * 10 - 9), ((i + 1) * 10), stars);
        }
    }
}

package jw222tf_assign4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by JorianWielink on 17/12/2016.
 */
public class Histogram {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(args[0]);
        Scanner in = new Scanner(inputFile);
        int[] groupCollection = new int[10];
        int max = 0;
        int outsideRange = 0;


        while (in.hasNextInt()) {
            int next = in.nextInt();
            int group;
            if (next > 0 && next <= 100) {
                group = (next - 1) / 10;
                groupCollection[group] = (groupCollection[group] + 1);
                //System.out.println(group);
            } else
                outsideRange++;
        }

        for (int aGroupCollection : groupCollection) {
            if (aGroupCollection > max) {
                max = aGroupCollection;
            }
        }

        System.out.println("Reading integers from file: " + inputFile + "\nOthers: " + outsideRange + "\n");
        for (int i = 0; i < groupCollection.length; i++) {
            StringBuilder stars = new StringBuilder();
            for (int j = 0; j < groupCollection[i]; j++) {
                stars.append("* ");
            }
            System.out.format("%2d - %3d  | %-" + max + "s\n", ((i + 1) * 10 - 9), ((i + 1) * 10), stars);
        }
    }
}

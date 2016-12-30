package Testy.Farm;

import java.io.*;
import java.util.Scanner;

/**
 * Created by JorianWielink on 29/12/2016.
 */
public class Trimmer {
    public static void main(String args[]) throws IOException {
        FileReader br = new FileReader("/Users/JorianWielink/Desktop/cities2.txt");
        Scanner in = new Scanner(br);

        //Scanner out = new Scanner(new File("/Users/JorianWielink/Desktop/cities-edit.txt"));
        //String newFile;

        File file = new File("/Users/JorianWielink/Desktop/cities-edit.txt");
        FileWriter fw = new FileWriter(file, true);
        //BufferedWriter bw = new BufferedWriter(fw);
        //PrintWriter out = new PrintWriter(bw);
        //fw.write("hoi");

        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
            String line = in.nextLine();
            String line2 = line.replace('\t', ';');
            String newFile = line2 + "\n";
            fw.write(newFile);
////            out.flush();
//  //          bw.flush();
            fw.flush();
        }
//        out.close();
//        bw.close();
        fw.close();

    }
}

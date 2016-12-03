package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class MultiDisplayMain {
    public static void main(String[] args) {
        MultiDisplay md = new MultiDisplay();


        md.setDisplayMessage("Hello World!");
        md.setDisplayCount(3);
        md.display();                           // ==> print-out

        md.display("Goodbye cruel world!", 2);  // ==> print-out

        System.out.println("Current Message: "+ md.getDisplayMessage());


        MultiDisplay md2 = new MultiDisplay("Hello second world!", 2);
        md2.display();
    }
}

package jw222tf_assign3;

/**
 * Created by Jorian on 7-12-2016 at 13:06.
 */
public class FractionMain {
    public static void main(String[] args) {
        Fraction ar = new Fraction();
        Fraction br = new Fraction(1,4);
        Fraction cr = new Fraction(5, -8);
        Fraction dr = new Fraction(-5, 8);

        System.out.println(ar.toString());
        System.out.println(br.toString());
        System.out.println(cr.toString() + ": Negative? " + cr.isNegative());
        System.out.println(dr.toString() + ": Negative? " + dr.isNegative());

        br.add(3);
        System.out.println(br.toString());

        ar.add(1,2);
        System.out.println(ar.toString());



    }

}

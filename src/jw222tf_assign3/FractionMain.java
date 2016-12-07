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
        Fraction er = new Fraction(9,12);

        System.out.println(br.getNumerator());
        System.out.println(br.getDenominator());


        System.out.println("String ar: " + ar.toString());
        System.out.println("String br: " + br.toString());
        System.out.println("String cr: " + cr.toString() + ": Negative? " + cr.isNegative());
        System.out.println("String dr: " + dr.toString() + ": Negative? " + dr.isNegative());
        System.out.println("String er: " + er.toString() + ": Negative? " + er.isNegative());


        //ar.setFraction(br);
        //System.out.println(ar.toString());

        er.divide(br);
        System.out.println(er.toString());

        br.add(dr);
        System.out.println(br.toString());

        br.add(1, 4);
        System.out.println(br.toString());




    }

}

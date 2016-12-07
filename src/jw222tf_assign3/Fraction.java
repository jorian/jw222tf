package jw222tf_assign3;

/**
 * Created by Jorian on 7-12-2016 at 13:00.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /*
    Constructors:
     */
    Fraction(){
        numerator = 1;
        denominator = 1;
    }

    Fraction(int num, int denom){
        /*
        Since this code is the same as the method setFraction, can I just call setFraction here?
         */
        numerator = num;
        if (denomNotZero(denom)) {
            denominator = denom;
        }
    }

    /*
    The two get-methods:
     */

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /*
    Created a setFraction, sets numerator and denominator to inputted integers:
     */
    public void setFraction(int num, int denom) {
        numerator = num;
        if (denomNotZero(denom)) {
            denominator = denom;
        }
    }

    /*
    A setFraction, sets the fraction according to an other Fraction object:
     */
    public void setFraction(Fraction fr1) {
        numerator = fr1.numerator;
        denominator = fr1.denominator;
    }

    /*
    Checks if the denominator is more or less than 0.
     */
    private boolean denomNotZero(int denom){
        if ((denom > 0) || (denom < 0)) {
            return true;
        }
        System.err.println("The denominator must be more or less than 0.");
        return false;
    }
    /*
    Converts object variables to a readable String format
     */
    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean isNegative(){
        /*
        Assuming both the numerator and the denominator can be negative.
        They cannot both be negative though, then they would actually be positive (multiply fraction with -1)
         */
        return (numerator < 0) ^ (denominator < 0);
    }

    public void makeEven(Fraction fr1, Fraction fr2) {
        int commonDivisor = commonDivisor(fr1.denominator, fr2.denominator);
        fr1.numerator = (fr1.numerator * (commonDivisor / fr1.denominator));
        fr2.numerator = (fr2.numerator * (commonDivisor / fr2.denominator));
        fr1.denominator = commonDivisor;
        fr2.denominator = commonDivisor;
    }

    public void add(int wholeNumber) {
        numerator += (wholeNumber * denominator);
    }

    private int commonDivisor(int denom1, int denom2) {
        return denom1 * denom2;
        //if (((gcd / 2) % denom1 == 0) && (gcd / 2) % denom2 == 0) {
        //    gcd /= 2;
        //}
    }

    public void add(int num, int denom) {
        Fraction fr1 = new Fraction(num, denom);
        Fraction fr2 = new Fraction(numerator, denominator);
        if (fr1.denominator != fr2.denominator) {
            makeEven(fr1, fr2);
        }
        numerator = fr1.numerator + fr2.numerator;
        denominator = fr1.denominator;
    }

    public void add(Fraction fr1) {
        Fraction fr2 = new Fraction(numerator, denominator);
        if (fr1.denominator != fr2.denominator) {
            makeEven(fr1, fr2);
        }
        numerator = fr1.numerator + fr2.numerator;
        denominator = fr1.denominator;
    }

    public void subtract() {

    }

    public void multiply() {

    }

    public void divide() {

    }


}

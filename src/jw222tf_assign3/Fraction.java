package jw222tf_assign3;

/**
 * Created by Jorian on 7-12-2016 at 13:00.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(){
        numerator = 1;
        denominator = 1;
    }

    Fraction(int num, int denom){
        numerator = num;
        if (denomNotZero(denom)) {
            denominator = denom;
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void setFraction(int num, int denom) {
        numerator = num;
        if (denomNotZero(denom)) {
            denominator = denom;
        }
    }

    private boolean denomNotZero(int denom){
        return (denom > 0) || (denom < 0);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean isNegative(){
        /*
        Assuming both the numerator and the denominator can be negative.
        They cannot both be negative though, then they would actually be positive (multiply fraction with -1)
         */
        return (numerator < 0) || (denominator < 0);
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
        if (denomNotZero(denom)) {
            if (denom != denominator) {
                int gcd = commonDivisor(denom, denominator);
                int newNum1 = num * (gcd / denom);
                int newNum2 = numerator * (gcd / denominator);
                setFraction(newNum1 + newNum2, gcd);
            } else {
                numerator += num;
            }
        } else {
            System.err.println("The denominator must be more or less than 0.");
        }
    }

    public void subtract() {

    }

    public void multiply() {

    }

    public void divide() {

    }


}

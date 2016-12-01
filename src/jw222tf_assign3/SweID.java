package jw222tf_assign3;

/**
 * Created by JorianWielink on 01/12/2016.
 */
public class SweID {
    public static void main(String[] args) {
        String idNumber1 = "911029-3249";
        String idNumber2 = "640123-8826";
        String idNumber3 = "550414-0913";

        System.out.println(getFirstPart(idNumber1));
        System.out.println(getLastPart(idNumber2));

        System.out.println("\n" + isFemaleNumber(idNumber2));
        System.out.println(isFemaleNumber(idNumber3));

        System.out.println("\n" + isMaleNumber(idNumber2));
        System.out.println(isMaleNumber(idNumber3));

        System.out.println("\n" + areEqual(idNumber1, idNumber2));
        System.out.println(areEqual(idNumber1, idNumber1));

        System.out.println("\n" + isCorrect(idNumber1));
    }

    private static String getFirstPart(String idNumber){
        return idNumber.substring(0,6);
    }

    private static String getLastPart(String idNumber){
        return idNumber.substring(7,11);
    }

    private static boolean isFemaleNumber(String idNumber) {
        return (Integer.valueOf(getLastPart(idNumber).substring(0,3)) % 2 == 0);
    }

    private static boolean isMaleNumber(String idNumber) {
        return (Integer.valueOf(getLastPart(idNumber).substring(0,3)) % 2 != 0); //learned about the difference between 'int' and 'Integer' here.
    }

    private static boolean areEqual(String idNumber1, String idNumber2) {
        return idNumber1.equals(idNumber2);
    }

    //date correct (y, m, d)
    //last part is correct according to rules on wikipedia.
    private static boolean isCorrect(String idNumber) {
        int sum = 0;
        int tempInt;
        for (int i = 0;i < idNumber.length();i++) {
            if (Character.isDigit(idNumber.charAt(i))) {
                tempInt = (int) idNumber.charAt(i) - '0';
                if (i % 2 == 0) {
                    if ((tempInt * 2) >= 10) {
                        sum += ((tempInt * 2) % 10);
                    }
                    else {
                        sum += (tempInt * 2);
                    }
                }
                else {
                    sum += tempInt;
                }
            }
        }
        System.out.println("\nChecksum: " + sum);

        return true;
    }


}

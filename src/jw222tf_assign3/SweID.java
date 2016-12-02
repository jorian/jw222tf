package jw222tf_assign3;

/**
 * Created by JorianWielink on 01/12/2016.
 */
public class SweID {
    public static void main(String[] args) {
        String idNumber1 = "911029-3249";
        String idNumber2 = "640123-8826";
        String idNumber3 = "551414-0913";

        System.out.println(getFirstPart(idNumber1));
        System.out.println(getLastPart(idNumber2));

        System.out.println("\n" + isFemaleNumber(idNumber2));
        System.out.println(isFemaleNumber(idNumber3));

        System.out.println("\n" + isMaleNumber(idNumber2));
        System.out.println(isMaleNumber(idNumber3));

        System.out.println("\n" + areEqual(idNumber1, idNumber2));
        System.out.println(areEqual(idNumber1, idNumber1));

        System.out.println("\n" + isCorrect(idNumber3));
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
        boolean monthCheck = false, dayCheck = false, checksumCheck = false;
        int sum = 0;
        int tempInt;
        idNumber = idNumber.replaceAll("-", "");
        int monthNr = Integer.valueOf(idNumber.substring(2,4));
        if (monthNr <= 12) {
            monthCheck = true;
        }
        else {
            System.err.println("The month you entered is not correct.");
        }

        int max = 0;
        switch (monthNr) {
            case 1:case 3:case 5:case 7:case 8:case 10: case 12 :
                max = 31;
                break;
            case 2:
                if (Integer.valueOf(idNumber.substring(0, 2)) % 4 == 0) {
                    max = 29;
                    break;
                }
                else {
                    max = 28;
                    break;
                }
            case 4:case 6:case 9:case 11 :
                max = 30;
                break;
        }

        int dayNr = Integer.valueOf(idNumber.substring(4, 6));
        if (dayNr <= max | !monthCheck) { //if monthCheck is false, a proper evaluation of dayCheck cannot be done.
            dayCheck = true;
        }
        else {
            System.err.println("The day you entered is incorrect.");
        }

        for (int i = 0;i < idNumber.length() - 1;i++) {
            if (Character.isDigit(idNumber.charAt(i))) {
                tempInt = (int) idNumber.charAt(i) - '0';
                if (i % 2 == 0) {
                    tempInt *= 2;
                    if (tempInt >= 10) {
                        tempInt = (tempInt / 10) + (tempInt % 10);
                        sum += tempInt;
                    }
                    else {
                        sum += tempInt;
                    }
                }
                else {
                    sum += tempInt;
                }
            }
        }
        System.out.println("\nChecksum: " + sum);
        int lastDigit = 10 - (sum % 10);
        if (lastDigit == 10) {
            lastDigit = 0;
        }
        int idNumberLastDigit = idNumber.charAt(idNumber.length() - 1) - '0';
        if (idNumberLastDigit == lastDigit) {
            checksumCheck = true;
        }

        return checksumCheck && dayCheck && monthCheck;
    }


}

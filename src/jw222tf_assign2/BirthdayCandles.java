package jw222tf_assign2;

/**
 * Created by Jorian on 15-11-2016 at 15:32.
 */
public class BirthdayCandles {
    public static void main(String[] args) {
        int candlesNeeded,box,candles=0,totalBoxes=0;
        boolean print;

        for(int i=1;i<=100;i++){
            print = false;
            box = 0;
            candlesNeeded = i;
            //I could just have used the variable i from the previous for loop
            //instead of declaring an additional variable candlesNeeded.
            for(int j=0;j<candlesNeeded;j++) {
                if (candles == 0) { //if no candles, buy a new box of candles:
                    box++;  //add a box for this year only (that's why box is set to 0 every year);
                    candles += 24; //24 candles in a box, so candles is topped up with 24.
                    print = true; //only print when boxes are needed.
                }
                candles -= 1;
            }
            totalBoxes += box;
            if(print) {
                System.out.println("Before birthday " + i + ", buy " + box + " box(es).");
            }
        }
        System.out.println("\nTotal number of boxes: "+totalBoxes+".\nRemaining candles: "+candles+".");
    }
}

package jw222tf_assign2;

/**
 * Created by Jorian on 15-11-2016 at 15:32.
 */
public class BirthdayCandles {
    public static void main(String[] args) {
        int candlesNeeded=0,box=0,candles=0,totalBoxes=0;
        boolean print;

        for(int i=1;i<=100;i++){
            print = false;
            box = 0;
            candlesNeeded = i;
            for(int j=0;j<candlesNeeded;j++) {
                if (candles == 0) {
                    box++;
                    candles += 24;
                    print = true;
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

package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class AlarmMain {
    public static void main(String[] args) {
        AlarmClock alarm = new AlarmClock(23,48);
        alarm.displayTime();
        alarm.setAlarm(6,15);

        for (int t = 0; t<=500; t++) {
            alarm.timeTick();
        }
        alarm.displayTime();
    }
}

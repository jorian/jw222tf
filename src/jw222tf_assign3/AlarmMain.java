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

//Only change I made in the AlarmClock.java was the line break type, since I am using a mac. Changed it to LF, was CRLF.
//http://stackoverflow.com/questions/1552749/difference-between-cr-lf-lf-and-cr-line-break-types
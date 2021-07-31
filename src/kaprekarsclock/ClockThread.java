package kaprekarsclock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Finds the time and starts a thread that will give the current time in the form(HH:mm:ss)
 */
public class ClockThread extends Thread {
    ClockMain clock;
    String time;

    /**
     * Constructor that takes the time
     *
     * @param clock
     */
    public ClockThread(ClockMain clock) {
        this.clock = clock;
        start();
    }
    public void run() {
        SimpleDateFormat formattedTime = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            Calendar cal = Calendar.getInstance();
            time = formattedTime.format(cal.getTime());
            clock.KClock.setText("Time: " + time);
//            clock.KPanel.
//            clock.KPanel.setSize(350, 150);
        }
    }
}

package kaprekarsclock;

import java.time.Clock;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * Finds the time and starts a thread that will give the current time in the form(HH:mm:ss)
 */
public class ClockThread extends Thread {
//    Clock cl = Clock.systemDefaultZone();
    ClockMain clock;
    String time;

    /**
     * Constructor that starts the clock thread
     *
     * @param clock
     */
    public ClockThread(ClockMain clock) {
        this.clock = clock;
        start();
    }
    public void run() {
//        SimpleDateFormat formattedTime = new SimpleDateFormat("HH:mm:ss");
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true) {
            LocalTime now = LocalTime.now();
//            Calendar cal = Calendar.getInstance();
//            time = formattedTime.format(cal.getTime());
            time = formattedTime.format(now);
            clock.KClock.setText("Time: " + time);
        }
    }
}

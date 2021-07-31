package kaprekarsclock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Finds the time and starts a thread that will give the current time in the form(HH:mm:ss)
 */
public class ClockThread extends Thread {
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
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true) {
            LocalTime now = LocalTime.now(); // get current time and set it to now
            time = formattedTime.format(now); // format time for hh:mm:ss
            clock.KClock.setText("Time: " + time); // run the clock based on the specifications in main
        }
    }
}

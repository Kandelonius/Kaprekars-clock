package kaprekarsclock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/**
 * Finds the time and starts a thread that will give the current time in the form(HH:mm:ss)
 */
public class ClockThread extends Thread {
    ClockMain clock;
    String time, seconds, hoursAndMinutes;
    boolean first = true;
    int iteration;

    /**
     * Constructor that starts the clock thread
     *
     * @param clock
     */
    public ClockThread(ClockMain clock) {
        this.clock = clock;
        start(); // calls the run method of this thread
    }

    private void getCount(String time) {
        // 4-digit number for hour and minutes in string form that can be sent to KaprekarCalculator
        hoursAndMinutes = time.substring(0, 2) + time.substring(3, 5);
        KaprekarCalculation kc = new KaprekarCalculation(hoursAndMinutes);
        iteration = kc.getCount();
        first = false;
    }

    public void run() {
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        while (true) {
            LocalTime now = LocalTime.now(); // get current time and set it to now
            time = formattedTime.format(now); // format time for hh:mm:ss
            seconds = time.substring((time.length() - 6));
            if (seconds.equals("00.000") || first) {
                getCount(time);
            }
            clock.KClock.setText(
                    "Time: " + time.substring(0, 8)); // run the clock based on the specifications in main
            clock.KNumber.setText("Iterations: " + iteration);
        }
    }
}
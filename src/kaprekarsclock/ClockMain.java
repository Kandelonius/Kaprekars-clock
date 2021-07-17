package kaprekarsclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockMain extends JFrame {
    JFrame displayFrame = new JFrame("Clock");
    JLabel KClock;
    ClockThread ct;
    Color denim = new Color(80, 100, 145);

    public ClockMain() {
        KClock = new JLabel("");
        setLayout(new FlowLayout());
        displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        KClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(denim);
        displayFrame.add(KClock);
        displayFrame.setSize(480,120);
        displayFrame.setLocationRelativeTo(null);
        ct = new ClockThread(this);
        displayFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClockMain();
    }
}

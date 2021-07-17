package kaprekarsclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

public class ClockMain extends JFrame {
    JFrame displayFrame = new JFrame("Clock");
    JLabel KClock;
    ClockThread ct;
    JPanel KPanel;
    Color denim = new Color(75, 100, 150);

    public ClockMain() {
        KClock = new JLabel("");
        KClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(denim);
        KPanel = new JPanel();
        KPanel.setSize(300, 150);
        KPanel.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        KPanel.setBackground(Color.red);
        displayFrame.setLayout(new FlowLayout());
        displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        displayFrame.getContentPane().setBackground(Color.black);
        displayFrame.setSize(480,480);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.add(KClock);
        displayFrame.add(KPanel);
        displayFrame.setVisible(true);
        ct = new ClockThread(this);
    }

    public static void main(String[] args) {
        new ClockMain();
    }
}

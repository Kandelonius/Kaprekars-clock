package kaprekarsclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

public class ClockMain extends JFrame {
    JFrame displayFrame = new JFrame("Clock");
    JLabel KClock;
    JLabel KNumber;
    ClockThread ct;
    JPanel CPanel;
    JPanel KPanel;
    Color denim = new Color(75, 100, 150);
    Color border = new Color(250, 150, 200);

    public ClockMain() {
        KPanel = new JPanel();
        KClock = new JLabel("");
        CPanel = new JPanel();
        KNumber = new JLabel("");
        KPanel.setSize(445, 150);
        KPanel.setBackground(denim);
        CPanel.setSize(445, 150);
        KClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(border);
        KNumber.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(border);
        displayFrame.setLayout(new FlowLayout());
        displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        displayFrame.getContentPane().setBackground(Color.black);
        displayFrame.setSize(480,480);
        displayFrame.setLocationRelativeTo(null);
        KPanel.add(KClock);
        KPanel.add(KNumber);
        displayFrame.add(KPanel);
        displayFrame.add(CPanel);
        displayFrame.setVisible(true);
        ct = new ClockThread(this);
    }

    public static void main(String[] args) {
        new ClockMain();
    }
}

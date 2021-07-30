package kaprekarsclock;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.*;

public class ClockMain extends JFrame {
    JFrame displayFrame = new JFrame("Clock");
    JLabel KClock;
    JLabel KNumber;
    ClockThread ct;
    JPanel CPanel;
//    JPanel KPanel;
    Color denim = new Color(75, 100, 150);
    Color border = new Color(250, 150, 200);

    public ClockMain() {
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        KPanel = new JPanel();
        KClock = new JLabel("");
        CPanel = new JPanel();
        KNumber = new JLabel("");
//        KPanel.setSize(445, 150);
//        KPanel.setBackground(denim);
//        CPanel.setSize(445, 150);
        KClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(border);
        KClock.setOpaque(true);
        KClock.setBackground(Color.black);
        KClock.setForeground(border);
        KClock.setBorder(BorderFactory.createLineBorder(denim, 5));
        KNumber.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        CPanel.setBackground(Color.black);
        displayFrame.setLayout(new GridLayout(2, 1));
        displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        displayFrame.getContentPane().setBackground(Color.black);
        displayFrame.setBounds(0, 0, 480,200);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.add(CPanel);
        CPanel.add(KClock);
//        KPanel.add(KNumber);
//        displayFrame.add(KPanel);
        displayFrame.setVisible(true);
        ct = new ClockThread(this);
    }

    public static void main(String[] args) {
//        new ClockMain();
//        KaprekarCalculation k = new KaprekarCalculation();
        KaprekarCalculation.KCalculate(5000);
    }
}

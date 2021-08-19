package kaprekarsclock;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class KaprekarPanel extends JPanel {
    JLabel panel;

    KaprekarPanel() {
        panel.setBounds(150, 150, 150, 150);
        panel.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        panel.setBackground(Color.red);
    }
}
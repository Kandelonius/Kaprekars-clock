package kaprekarsclock;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class KaprekarPanel extends JPanel {
    JPanel panel;

    KaprekarPanel() {
        panel.setBounds(150, 150, 150, 150);
        panel.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        panel.setBackground(Color.red);
    }
}

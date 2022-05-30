package demo;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java Swing");

        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

        frame.getContentPane().add(lblText);

        frame.pack();
        frame.setVisible(true);
    }
}

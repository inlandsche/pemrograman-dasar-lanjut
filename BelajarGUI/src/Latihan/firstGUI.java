package Latihan;

import javax.swing.*;
import java.awt.*;

public class firstGUI {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JButton button = new JButton("Ini Tombol");
        JLabel label = new JLabel("Counter");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.setBounds(50,50,100,30);
        button.setBackground(Color.gray);

        label.setBounds(20,20, 100, 50);

        window.add(button);
        window.add(label);
        window.setSize(200, 200);

        window.setLayout(null);
        window.setVisible(true);
    }


}

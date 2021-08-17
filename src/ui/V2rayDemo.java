package ui;

import javax.swing.*;
import java.awt.*;

public class V2rayDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
       // frame.setBackground(Color.BLACK);
        //frame.setLayout(new FlowLayout());
        Panel panel=new Panel();
        panel.setBackground(Color.BLACK);
        frame.add(panel);
        frame.setBounds(1366/2,768/2,700,400);
        frame.setVisible(true);
    }
}


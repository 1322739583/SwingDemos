package ui;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayoutDemo");
        Panel panel = new Panel();
        BoxLayout boxLayout=new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.add(new Button("button1"));
        panel.add(new Button("button2"));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
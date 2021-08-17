package ui;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayoutDemo2");
        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("button1"));
        horizontalBox.add(new Button("button2"));
        verticalBox.add(horizontalBox);
        verticalBox.add(new Button("button3"));
        verticalBox.add(new Button("button4"));

        Panel panel = new Panel();
        panel.add(verticalBox);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
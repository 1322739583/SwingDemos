package ui;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo3 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayoutDemo3");


        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("button1"));
        //添加glue
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(new Button("button2"));
        horizontalBox.add(Box.createHorizontalStrut(50));
        horizontalBox.add(new Button("button3"));
        verticalBox.add(horizontalBox);
        verticalBox.add(new Button("button4"));
        verticalBox.add(Box.createVerticalStrut(50));
        verticalBox.add(new Button("button5"));

        frame.add(verticalBox);
        frame.pack();
        frame.setVisible(true);
    }
}
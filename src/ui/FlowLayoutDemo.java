package ui;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("frame1");
        Panel panel = new Panel();

        //FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 20, 20);
       // FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,20,20);
         FlowLayout flowLayout=new FlowLayout(FlowLayout.RIGHT,20,20);
        panel.setLayout(flowLayout);
        for (int i = 0; i < 100; i++) {
            panel.add(new Button("button" + i));
        }


        frame.add(panel);
        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
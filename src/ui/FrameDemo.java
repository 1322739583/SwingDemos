package ui;

import java.awt.*;

/**
 * 实现一个最简单的Frame
 */
public class FrameDemo {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setTitle("frame1");
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}

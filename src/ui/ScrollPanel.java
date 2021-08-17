package ui;

import java.awt.*;

public class ScrollPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("frame1");
       // Panel panel = new Panel();
        ScrollPane pane=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        pane.add(new TextField("测试文本"));
        pane.add(new Button("测试按钮"));

     //   panel.add(pane);
        frame.add(pane);

        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
package ui;

import java.awt.*;

/**
 * 实现一个最简单panel，并添加一些组件到这上面
 */
public class PanelDemo1 {
    public static void main(String[] args) {
        Frame frame=new Frame("frame1");

        Panel panel=new Panel();
        panel.add(new TextField("测试文本"));
        panel.add(new Button("测试文本"));
        frame.add(panel);

        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}

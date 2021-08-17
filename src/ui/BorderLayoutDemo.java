package ui;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setTitle("BorderLayoutDemo");
        BorderLayout borderLayout=new BorderLayout(10,10);
        frame.setLayout(borderLayout);
        frame.add(new Button("中"),BorderLayout.CENTER);
        frame.add(new Button("北"),BorderLayout.NORTH);
        frame.add(new Button("南"),BorderLayout.SOUTH);
        frame.add(new Button("西"),BorderLayout.WEST);
        frame.add(new Button("东"),BorderLayout.EAST);

        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}

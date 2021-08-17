package ui;

import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayoutDemo");
        Panel textPanel = new Panel();
        textPanel.add(new TextField(30));
        Panel calPanel=new Panel();
        calPanel.setLayout(new GridLayout(6,3,10,10));
        for (int i = 1; i <10 ; i++) {
            calPanel.add(new Button(i+""));
        }
        calPanel.add(new Button("AC"));
        calPanel.add(new Button("+"));
        calPanel.add(new Button("-"));
        calPanel.add(new Button("%"));
        calPanel.add(new Button("*"));
        calPanel.add(new Button("/"));
        calPanel.add(new Button("."));
        calPanel.add(new Button("0"));
        calPanel.add(new Button("="));


        frame.add(textPanel,BorderLayout.NORTH);
        frame.add(calPanel,BorderLayout.CENTER);
       // frame.setBounds(100, 100, 500, 300);
        frame.pack();
        frame.setVisible(true);
    }
}
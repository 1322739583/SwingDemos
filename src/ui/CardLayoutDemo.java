package ui;

import java.awt.*;

public class CardLayoutDemo {

    private static Button 上一张;

    public static void main(String[] args) {
        Frame frame = new Frame("frame1");
        Panel cardPanel = new Panel();

        CardLayout cardLayout=new CardLayout();
        cardPanel.setLayout(cardLayout);
        for (int i = 1; i <=5 ; i++) {
            cardPanel.add(i+"",new Button("第"+i+"张"));
        }

        Panel bottomPanel=new Panel();
        Button prevBtn = new Button("上一张");
        Button nextBtn = new Button("下一张");
        Button firstBtn = new Button("第一张");
        Button lastBtn = new Button("最后一张");
        Button thirdBtn = new Button("第三张");

        prevBtn.addActionListener(e -> cardLayout.previous(cardPanel));
        nextBtn.addActionListener(e -> cardLayout.next(cardPanel));
        firstBtn.addActionListener(e -> cardLayout.first(cardPanel));
        lastBtn.addActionListener(e -> cardLayout.last(cardPanel));
       thirdBtn.addActionListener(e -> cardLayout.show(cardPanel,"3"));



        bottomPanel.add(prevBtn);
        bottomPanel.add(nextBtn);
        bottomPanel.add(firstBtn);
        bottomPanel.add(lastBtn);
        bottomPanel.add(thirdBtn);



        frame.add(cardPanel);
        frame.add(bottomPanel,BorderLayout.SOUTH);




        frame.pack();
        frame.setVisible(true);

    }
}

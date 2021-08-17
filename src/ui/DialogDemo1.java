package ui;

import java.awt.*;

public class DialogDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("DialogDemo1");
        Panel panel = new Panel();

        Button button=new Button("打开对话框");
        panel.add(button);
        Dialog dialog=new Dialog(frame,"title",false);
        dialog.setBounds(100,100,200,200);

        dialog.add(new Label("提示",Label.CENTER));
        dialog.add(new Button("确认"),BorderLayout.SOUTH);
        button.addActionListener(e -> {
           dialog.setVisible(true);
        });


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
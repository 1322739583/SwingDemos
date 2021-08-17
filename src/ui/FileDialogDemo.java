package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FileDialogDemo");
        Panel panel = new Panel();

        Button btnOpen=new Button("打开文件");
        Button btnSave=new Button("保存文件");
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(btnOpen);
        verticalBox.add(btnSave);
        panel.add(verticalBox);

        FileDialog openDialog=new FileDialog(frame,"打开文件",FileDialog.LOAD);
        FileDialog saveDialog=new FileDialog(frame,"打开文件",FileDialog.SAVE);


        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //会阻塞在这里
                openDialog.setVisible(true);
                String directory = openDialog.getDirectory();
                String file = openDialog.getFile();
                System.out.println(directory);
                System.out.println(file);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDialog.setVisible(true);
                String directory = saveDialog.getDirectory();
                String file = saveDialog.getFile();
                System.out.println(directory);
                System.out.println(file);
            }
        });


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

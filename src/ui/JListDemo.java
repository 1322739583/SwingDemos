package ui;

import javax.swing.*;
import java.awt.*;

public class JListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JListDemo");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 150));
        String[] str=new String[]{"11","22"};
        JList<String> contentList=new JList( );
        contentList.setPreferredSize(new Dimension(200, 150));
        ListModel listModel=new DefaultComboBoxModel(str);
        contentList.setModel(listModel);
        //panel.setBounds(100,100,200,300);



        panel.add(contentList);

        frame.add(panel);
         frame.pack();
        frame.setVisible(true);
    }
}
package examples;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FileManager {

    private static JPanel filePanel;
    private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        filePanel = new JPanel();
        JLabel imageLable=new JLabel();
        JLabel textLabel=new JLabel();
        imageLable.setIcon(new ImageIcon("image/folder.png"));
        imageLable.setText("image text");
        imageLable.setHorizontalTextPosition(SwingConstants.CENTER);
        imageLable.setVerticalTextPosition(SwingConstants.BOTTOM);

       // imageLable.setVerticalAlignment(SwingConstants.BOTTOM);
       // imageLable.setVerticalAlignment(SwingConstants.BOTTOM);
      //  imageLable.setVerticalTextPosition(10);

        textLabel.setText("text lable 2");
        Dimension labelSize = textLabel.getSize();
        System.out.println(labelSize);
        Dimension preferredSize = textLabel.getPreferredSize();
        System.out.println(preferredSize);
        Dimension maximumSize = textLabel.getMaximumSize();
        System.out.println(maximumSize);
        Dimension minimumSize = textLabel.getMinimumSize();
        System.out.println(minimumSize);
        textLabel.setBackground(Color.ORANGE);
        textLabel.setIconTextGap(imageLable.getPreferredSize().width/2);

        // textLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        //textLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        filePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        Box fileBox = Box.createVerticalBox();

        FileManager fileManager=new FileManager();
        fileManager.getFiles();


        //fileBox.add(imageLable);
      //  fileBox.add(textLabel);
     //   filePanel.add(fileBox );
     //   frame.add(fileBox);
        frame.pack();
        frame.setVisible(true);



    }

    public void getFiles(){
        File rootPath=new File("/home/xzh");
        File[] files = rootPath.listFiles();
        JPanel panel=new JPanel();
       // fileBox.add(new ImageIcon())
        for (File file1 : files) {
            JLabel imageLable=new JLabel();
           // JLabel textLabel=new JLabel();

            imageLable.setHorizontalTextPosition(SwingConstants.CENTER);
            imageLable.setVerticalTextPosition(SwingConstants.BOTTOM);
            imageLable.setText(file1.getName());
            if (file1.isDirectory()){
                imageLable.setIcon(new ImageIcon("image/folder.png"));
            }else {
                imageLable.setIcon(new ImageIcon("image/shell.png"));
            }

            panel.add(imageLable);
            frame.add(panel);
          //  System.out.println(file1.getName());
            //filePanel.add()


        }
    }


}

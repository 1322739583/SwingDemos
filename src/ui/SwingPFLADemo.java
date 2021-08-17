package ui;

import mdlaf.MaterialLookAndFeel;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class SwingPFLADemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        //1.菜单部分
        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("文件");
        JMenu editMenu=new JMenu("编辑");
        JMenuItem autoItem=new JMenuItem("自动换行");
        JMenuItem copyItem=new JMenuItem("复制");
        JMenuItem pasteItem=new JMenuItem("粘贴");
        JMenu formatMenu=new JMenu("格式");
        JMenuItem commentItem=new JMenuItem("注释");
        JMenuItem uncommentItem=new JMenuItem("取消注释");

        editMenu.add(autoItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        formatMenu.add(commentItem);
        formatMenu.add(uncommentItem);
        editMenu.add(formatMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);
         //右键菜单
        JPopupMenu popupMenu=new JPopupMenu();
        JMenuItem mdItem=new JMenuItem("自动换行");
        JMenuItem moItem=new JMenuItem("复制");

        popupMenu.add(mdItem);
        popupMenu.add(moItem);

        

        popupMenu.addMenuKeyListener(new MenuKeyListener() {
            @Override
            public void menuKeyTyped(MenuKeyEvent e) {

            }

            @Override
            public void menuKeyPressed(MenuKeyEvent e) {

            }

            @Override
            public void menuKeyReleased(MenuKeyEvent e) {

            }
        });

        popupMenu.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        JTextArea textArea=new JTextArea(20,50);
        JList<String> list=new JList();
        list.add(new JLabel("red"));
        list.add(new JLabel("blue"));
        list.add(new JLabel("green"));
        Box horizontalBox = Box.createHorizontalBox();
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(textArea);
        verticalBox.add(horizontalBox);
        Box mainHBox = Box.createHorizontalBox();
        mainHBox.add(verticalBox);
        mainHBox.add(list);
        JRadioButton rbMan=new JRadioButton();
        JRadioButton rbFemale=new JRadioButton();
        JCheckBox checkBox=new JCheckBox("婚姻",false);
        horizontalBox.add(rbMan);
        horizontalBox.add(rbFemale);
        horizontalBox.add(checkBox);
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        frame.add(mainHBox);
        frame.pack();
        frame.setVisible(true);
    }
}

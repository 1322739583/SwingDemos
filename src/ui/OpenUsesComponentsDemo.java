package ui;

import javax.swing.*;
import java.awt.*;

public class OpenUsesComponentsDemo {


    public static void main(String[] args) {
        List list=new List();
        list.add("红色");
        list.add("蓝色");
        list.add("绿色");
        TextArea textArea=new TextArea(20,50);
        Choice choice=new Choice();
        choice.add("红色");
        choice.add("蓝色");
        choice.add("绿色");
        CheckboxGroup checkboxGroup=new CheckboxGroup();
        Checkbox cbMale=new Checkbox("男",checkboxGroup,true);
        Checkbox cbFemale=new Checkbox("女",checkboxGroup,true);
        checkboxGroup.setSelectedCheckbox(cbMale);
        Checkbox cbMarried=new Checkbox("已婚",false);
        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(choice);
        horizontalBox.add(cbMale);
        horizontalBox.add(cbFemale);
        horizontalBox.add(cbMarried);
        verticalBox.add(textArea);
        verticalBox.add(horizontalBox);

        Box horizontalBox2 = Box.createHorizontalBox();
        horizontalBox2.add(verticalBox);
        horizontalBox2.add(list);

        Box bottomHBox = Box.createHorizontalBox();
        bottomHBox.add(new TextField(50));
        bottomHBox.add(new Button("确认"));
        Box wholeVBOX = Box.createVerticalBox();
        wholeVBOX.add(horizontalBox2);
        wholeVBOX.add(bottomHBox);


        Frame frame=new Frame();
        frame.add(wholeVBOX);
        frame.pack();
        frame.setVisible(true);
    }
}

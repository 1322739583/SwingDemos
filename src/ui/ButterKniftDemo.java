package ui;

import java.awt.*;

public class ButterKniftDemo {



    public static void main(String[] args) {
        Frame frame = new Frame("GridLayoutDemo");

        Panel topPanel=new Panel();
        topPanel.setLayout(new GridLayout(0,5,10,10));
        Checkbox checkbox=new Checkbox();
        checkbox.setState(true);
        Font font=new Font("arial", Font.BOLD, 12);
        Label elementLable=new Label("Element");
        elementLable.setFont(font);
        Label idLable=new Label("ID");
        idLable.setFont(font);
        Label onClickLable=new Label("OnClick");
        onClickLable.setFont(font);
        Label varNameLable=new Label("Variable Name");
        varNameLable.setFont(font);

        topPanel.add(checkbox);
        topPanel.add(elementLable);
        topPanel.add(idLable);
        topPanel.add(onClickLable);
        topPanel.add(varNameLable);


        Checkbox listCheckbox=new Checkbox();
        listCheckbox.setState(true);
        Label listElementLable=new Label("Element");
       // listElementLable.setFont(font);
        Label listIdLable=new Label("ID");
       // listIdLable.setFont(font);
        Checkbox listOnClickCheckBox=new Checkbox();
        //listOnClickLable.setFont(font);
        TextField listVarNameTF=new TextField("Variable Name");
       // listVarNameLable.setFont(font);

        Panel listPanel=new Panel();
        listPanel.setLayout(new GridLayout(0,5,10,10));

        listPanel.add(listCheckbox);
        listPanel.add(listElementLable);
        listPanel.add(listIdLable);
        listPanel.add(listOnClickCheckBox);
        listPanel.add(listVarNameTF);

        Panel attrPanel=new Panel();
     //   attrPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        //这里的hfill必须设置为true,子视图才可以左右对齐
        attrPanel.setLayout(new VFlowLayout(VFlowLayout.TOP,true,false));



        Panel createPanel=new Panel();

        FlowLayout flowLayout=new FlowLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        createPanel.setLayout(flowLayout);
        createPanel.add(new Label("Create ViewHolder"));
        createPanel.add(new Checkbox());

        Panel initPanel=new Panel();
        initPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        initPanel.add(new Label("Init "));
        initPanel.add(new Checkbox());

        Panel okOrCanclePanel=new Panel();
        okOrCanclePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        okOrCanclePanel.add(new Button("Cancle"));
        okOrCanclePanel.add(new Button("    Ok    "));


        attrPanel.add(createPanel);
        attrPanel.add(initPanel);
        attrPanel.add(okOrCanclePanel);




        frame.add(topPanel,BorderLayout.NORTH);
        frame.add(listPanel,BorderLayout.CENTER);
        frame.add(attrPanel,BorderLayout.SOUTH);

        // frame.setBounds(100, 100, 500, 300);
        frame.pack();
        frame.setVisible(true);
    }
}

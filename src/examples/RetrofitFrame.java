/*
 * Created by JFormDesigner on Tue Aug 17 14:11:19 CST 2021
 */

package examples;

import com.formdev.flatlaf.FlatDarculaLaf;
import net.miginfocom.swing.*;
import okhttp3.*;
import utils.JsonFormater;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author 1
 */
public class RetrofitFrame extends JFrame {
    private static String TAG="RetrofitFrame";

    public RetrofitFrame() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        button1 = new JButton();
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();
        label2 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        label6 = new JLabel();
        label8 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        setTitle("fob");
        setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[78,fill]" +
            "[153,fill]" +
            "[274,fill]" +
            "[204,fill]" +
            "[151,fill]" +
            "[230,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[305]"));
        contentPane.add(comboBox1, "cell 0 0");

        //---- textField1 ----
        textField1.setToolTipText("input your api");
        textField1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(textField1, "cell 1 0 4 1");

        //---- button1 ----
        button1.setText("\u751f\u6210");
        contentPane.add(button1, "cell 5 0");

        //======== tabbedPane1 ========
        {

            //======== panel3 ========
            {
                panel3.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));
            }
            tabbedPane1.addTab("\u5386\u53f2\u8bb0\u5f55", panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[149,fill]" +
                    "[139,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));
            }
            tabbedPane1.addTab("\u6536\u85cf\u5939", panel4);
        }
        contentPane.add(tabbedPane1, "cell 6 0 1 3");

        //---- label1 ----
        label1.setText("Service\u8def\u5f84");
        contentPane.add(label1, "cell 0 1,hmin 30");
        contentPane.add(textField2, "cell 1 1 4 1,wmin 500,hmin 30");

        //---- button2 ----
        button2.setText("\u6253\u5f00");
        contentPane.add(button2, "cell 1 1 4 1");

        //---- label2 ----
        label2.setText("Service\u540d\u5b57");
        contentPane.add(label2, "cell 0 2,hmin 30");
        contentPane.add(textField3, "cell 1 2 4 1,wmax 180,hmin 30");

        //---- label4 ----
        label4.setText("\u72b6\u6001\u7801:");
        contentPane.add(label4, "cell 0 3");

        //---- label6 ----
        label6.setText("\u54cd\u5e94\u65f6\u95f4:");
        contentPane.add(label6, "cell 4 3");

        //---- label8 ----
        label8.setText("\u5927\u5c0f:");
        contentPane.add(label8, "cell 5 3");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, "cell 0 4 6 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button1;
    private JTabbedPane tabbedPane1;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label1;
    private JTextField textField2;
    private JButton button2;
    private JLabel label2;
    private JTextField textField3;
    private JLabel label4;
    private JLabel label6;
    private JLabel label8;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void initRetrofitFrame(RetrofitFrame frame) {
        comboBox1.addItem("GET");
        comboBox1.addItem("POST");
     //  textField1.setSize(50,30);

//        textArea1.setPreferredSize(new Dimension(500,500));
//        textArea1.setMinimumSize(new Dimension(500,500));
        FileDialog openDialog=new FileDialog(frame,"打开文件夹",FileDialog.LOAD);
      //  String path = this.getClass().getResource("/").getPath().toString();
      //  System.out.println("current path:"+path);
        String path=System.getProperty("user.dir");
        openDialog.setDirectory(path);
        openDialog.setFocusable(true);
        openDialog.setAutoRequestFocus(true);
        openDialog.setAlwaysOnTop(true);
     //   System.out.println(System.getProperty("user.dir"));




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String url = textField1.getText().trim();
                        System.out.println(url);
                        OkHttpClient okHttpClient = new OkHttpClient();
                        final Request request = new Request.Builder()
                                .url(url)
                                .get()//默认就是GET请求，可以不写
                                .build();
                        Call call = okHttpClient.newCall(request);
                        call.enqueue(new Callback() {
                            @Override
                            public void onFailure(Call call, IOException e) {
                                System.out.println(TAG+ "onFailure: ");

                            }

                            @Override
                            public void onResponse(Call call, Response response) throws IOException {
                              //  System.out.println(TAG+ "onResponse: " + response.body().string());
                                label4.setText("状态码："+response.code()+"");
                                label6.setText("响应时间："+response.receivedResponseAtMillis()+"");
                               // labelSize.setText("大小："+response.+"");
                                //String html = HtmlFormater.formatHtml(response.body().string());
                              //  Object parse = JSON.parse(response.body().string());
                                String json = JsonFormater.prettyJson(response.body().string());
                                textArea1.setText("\n"+json+"\n\n\n");



                            }
                        });
                    }
                }).start();




            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //会阻塞在这里
                openDialog.setVisible(true);
             //   openDialog.
                String directory = openDialog.getDirectory();
                String file = openDialog.getFile();
                textField2.setText(directory);
                textField3.setText(file);
                System.out.println(directory);
                System.out.println(file);
            }
        });



    }


    public static void main(String[] args) {
        RetrofitFrame frame;
        frame = new RetrofitFrame();
        FlatDarculaLaf.install();
        frame.setSize(1333,700);
        frame.initRetrofitFrame(frame);
        frame.setAlwaysOnTop(false);
        frame.setFocusable(false);
       // frame.pack();
        frame.setVisible(true);
    }
}

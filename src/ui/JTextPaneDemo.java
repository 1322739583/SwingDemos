package ui;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;

public class JTextPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextPaneDemo");
        frame.setBounds(100,100,500,300);
       // JPanel panel = new JPanel();

         JTextPane textpane=new JTextPane();
         HTMLDocument text_html;
        HTMLEditorKit htmledit;

        htmledit=new HTMLEditorKit();
        //实例化一个HTMLEditorkit工具包，用来编辑和解析用来显示在jtextpane中的内容。
        text_html=(HTMLDocument) htmledit.createDefaultDocument();
        //使用HTMLEditorKit类的方法来创建一个文档类，HTMLEditorKit创建的类型默认为htmldocument。
        textpane.setEditorKit(htmledit);
        //设置jtextpane组件的编辑器工具包，是其支持html格式。
        textpane.setContentType("text/html");
        //设置编辑器要处理的文档内容类型，有text/html,text/rtf.text/plain三种类型。
        textpane.setDocument(text_html);
        //设置编辑器关联的一个文档。
        SimpleAttributeSet attr=new SimpleAttributeSet();
//实例化一个simpleAttributeSet类。
        StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
        //使用StyleConstants工具类来设置attr属性，这里设置居中属性。
       // textpane.setParagraphAttributes(attr,false);
        //设置段落属性，第二个参数为false表示不覆盖以前的属性，如果选择true，会覆盖以前的属性。

      //  StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
        //设置属性居左


       // Color color=JColorChooser.showDialog(null,"color title", Color.BLACK);
//使用JColorChooser组件来提供一个颜色选择框。并返回选择的颜色，最后一个参数是缺省颜色。

       //  StyleConstants.setForeground(attr, color);
        //设置颜色属性，参数为color类型。
        textpane.setCharacterAttributes(attr, false);

        try {
           // htmledit.insertHTML(text_html, textpane.getCaretPosition(),
                //    "<img src='http://pic1.sc.chinaz.com/Files/pic/icons128/4803/xplorer.png'>", 0, 0, HTML.Tag.IMG);
            htmledit.insertHTML(text_html, 0, "<p>  &lt   te <br><br>xt </p>" , 0, 0,  HTML.Tag.P)  ;
            htmledit.insertHTML(text_html, 0, "<br></br>" , 0, 0,  HTML.Tag.BR)  ;
           htmledit.insertHTML(text_html, 0, "<p>     text </p>" , 0, 0,  HTML.Tag.P)  ;
            htmledit.insertHTML(text_html, 0, "<br></br>" , 0, 0,  HTML.Tag.BR)  ;
           htmledit.insertHTML(text_html, 4, "<h1> h1</h1>" , 0, 0,  HTML.Tag.H1)  ;
            htmledit.insertHTML(text_html, 0, "<br></br>" , 0, 0,  HTML.Tag.BR)  ;
            htmledit.insertHTML(text_html, 0, "<h3> h3</h3>" , 0, 0,  HTML.Tag.H3)  ;
            htmledit.insertHTML(text_html, 0, "<br></br>" , 0, 0,  HTML.Tag.BR)  ;
            htmledit.insertHTML(text_html, 0, "<h3> h3</h3>" , 0, 0,  HTML.Tag.H3)  ;
            htmledit.insertHTML(text_html, 0, "<br></br>" , 0, 0,  HTML.Tag.BR)  ;
             htmledit.insertHTML(text_html, 0, "<p> text </p>" , 0, 0,  HTML.Tag.P)  ;
           // htmledit.insertHTML(text_html, textpane.getCaretPosition(), "<p> text2 </p>" , 0, 0,  HTML.Tag.P)  ;


        } catch (BadLocationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        textpane.setEditable(false);


        frame.add(textpane);
       // frame.pack();
        frame.setVisible(true);
    }
}
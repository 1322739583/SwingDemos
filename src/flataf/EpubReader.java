package flataf;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.sun.java.accessibility.util.Translator;
import nl.siegmann.epublib.domain.*;
import nl.siegmann.epublib.epub.EpubWriter;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class EpubReader {
    public static void main(String[] args) {
        FlatDarculaLaf.install();
        JFrame frame=new JFrame();
        //1.添加菜单
        JPanel menuPanel=new JPanel();
        addMenu(frame,menuPanel);
        //2.添加目录
        JPanel contentPanal=new JPanel();
        addContent(frame,contentPanal);
        //3.添加主文本区
        addReadPanel(frame);

        //g
        getEpub();

        //frame.pack();
        frame.setBounds(200,50,1000,600);
        frame.setVisible(true);
    }

    private static InputStream getResource(String path ) {
        return Translator.class.getResourceAsStream( path );
    }

    private static Resource getResource(String path, String href ) {
        Resource resource = null;
        try {
            resource = new Resource( getResource( path ), href );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resource;
    }

    private static void getEpub() {
        try {
            // Create new Book
            Book book = new Book();
            Metadata metadata = book.getMetadata();

            // Set the title
            metadata.addTitle("Epublib test book 1");

            // Add an Author
            metadata.addAuthor(new Author("Joe", "Tester"));

            // Set cover image
            book.setCoverImage(
                    getResource("/book1/test_cover.png", "cover.png") );

            // Add Chapter 1
            book.addSection("Introduction",
                    getResource("/book1/chapter1.html", "chapter1.html") );

            // Add css file
            book.getResources().add(
                    getResource("/book1/book1.css", "book1.css") );

            // Add Chapter 2
            TOCReference chapter2 = book.addSection( "Second Chapter",
                    getResource("/book1/chapter2.html", "chapter2.html") );

            // Add image used by Chapter 2
            book.getResources().add(
                    getResource("/book1/flowers_320x240.jpg", "flowers.jpg"));

            // Add Chapter2, Section 1
            book.addSection(chapter2, "Chapter 2, section 1",
                    getResource("/book1/chapter2_1.html", "chapter2_1.html"));

            // Add Chapter 3
            book.addSection("Conclusion",
                    getResource("/book1/chapter3.html", "chapter3.html"));

            // Create EpubWriter
            EpubWriter epubWriter = new EpubWriter();

            // Write the Book as Epub
            epubWriter.write(book, new FileOutputStream("test1_book1.epub"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addReadPanel(JFrame frame) {
        JPanel readPanel=new JPanel();

        readPanel.setBackground(new Color(207, 226, 40));
        JTextPane textPane=new JTextPane();
        textPane.setText("text");
        //设置光标颜色
        textPane.setCaretColor(new Color(232, 239, 69));



         readPanel.setLayout(new BorderLayout(20,20));
        readPanel.add(textPane);

        frame.add(readPanel,BorderLayout.CENTER);
    }

    /**
     * 添加目录
     * @param frame
     * @param contentPanal
     */
    private static void addContent(JFrame frame, JPanel contentPanal) {
//        String[] contents=new String[]{"第一章","第二章"};
//        JList<String> contentList=new JList(contents);
//         contentList.setPreferredSize(new Dimension(100,500));
//        contentPanal.add(contentList);
//        frame.add(contentPanal,BorderLayout.WEST);

        // 创建根节点
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("中国");

        // 创建二级节点
        DefaultMutableTreeNode gdNode = new DefaultMutableTreeNode("广东");
        DefaultMutableTreeNode fjNode = new DefaultMutableTreeNode("福建");
        DefaultMutableTreeNode shNode = new DefaultMutableTreeNode("上海");
        DefaultMutableTreeNode twNode = new DefaultMutableTreeNode("台湾");
        // 把二级节点作为子节点添加到根节点
        rootNode.add(gdNode);
        rootNode.add(fjNode);
        rootNode.add(shNode);
        rootNode.add(twNode);

        // 创建三级节点
        DefaultMutableTreeNode gzNode = new DefaultMutableTreeNode("广州");
        DefaultMutableTreeNode szNode = new DefaultMutableTreeNode("深圳");

        DefaultMutableTreeNode fzNode = new DefaultMutableTreeNode("福州");
        DefaultMutableTreeNode xmNode = new DefaultMutableTreeNode("厦门");

        DefaultMutableTreeNode tbNode = new DefaultMutableTreeNode("台北");
        DefaultMutableTreeNode gxNode = new DefaultMutableTreeNode("高雄");
        DefaultMutableTreeNode jlNode = new DefaultMutableTreeNode("基隆");

        // 把三级节点作为子节点添加到相应的二级节点
        gdNode.add(gzNode);
        gdNode.add(szNode);

        fjNode.add(fzNode);
        fjNode.add(xmNode);

        twNode.add(tbNode);
        twNode.add(gxNode);
        twNode.add(jlNode);

        // 使用根节点创建树组件
        JTree tree = new JTree(rootNode);
        DefaultTreeCellRenderer render = new DefaultTreeCellRenderer();

// 设置节点 展开 和 折叠 状态显示的图标
        render.setOpenIcon(null);
        render.setClosedIcon(null);
        render.setLeafIcon(null);
        tree.setCellRenderer(render);

        // 设置树显示根节点句柄
        tree.setShowsRootHandles(true);
        // 设置树节点可编辑
        tree.setEditable(true);

        tree.setPreferredSize(new Dimension(200,500));

        // 设置节点选中监听器
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                System.out.println("当前被选中的节点: " + e.getPath());
            }
        });

        // 创建滚动面板，包裹树（因为树节点展开后可能需要很大的空间来显示，所以需要用一个滚动面板来包裹）
        JScrollPane scrollPane = new JScrollPane(tree);

        frame.add(scrollPane,BorderLayout.WEST);


    }

    /**
     * 添加菜单
     * @param frame
     * @param menuPanel
     */
    private static void addMenu(JFrame frame, JPanel menuPanel) {
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
        menuPanel.add(menuBar);
        frame.add(menuPanel,BorderLayout.NORTH);
    }
}

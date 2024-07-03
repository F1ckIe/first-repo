//2024.6.24
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Menu {
    JMenuBar menubar; // 创建菜单栏
    JMenu menu1, menu2, menu3, menu4, menu5, menu6, menu7; // 创建菜单，子菜单
    JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9; // 创建菜单子项

    public Menu() {
        menubar = new JMenuBar();
        menu1 = new JMenu("添加物品"); // 设置菜单名
        menu2 = new JMenu("查询编辑");
        menu3 = new JMenu("显示物品库");
        menu4 = new JMenu("删除物品");
        menu5 = new JMenu("物品存盘");
        menu6 = new JMenu("读入物品");
        menu7 = new JMenu("统计信息");

        item1 = new JMenuItem("新建图书", new ImageIcon("a.gif"));
        item2 = new JMenuItem("新建视频光盘", new ImageIcon("b.gif"));
        item3 = new JMenuItem("新建图画", new ImageIcon("c.gif"));
        item4 = new JMenuItem("按标题查询", new ImageIcon("d.gif"));
        item5 = new JMenuItem("按编号查询", new ImageIcon("e.gif"));
        item6 = new JMenuItem("按类别查询", new ImageIcon("f.gif"));
        item7 = new JMenuItem("显示图书", new ImageIcon("f.gif"));
        item8 = new JMenuItem("显示CD", new ImageIcon("f.gif"));
        item9 = new JMenuItem("显示图画", new ImageIcon("f.gif"));
        item4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK)); // 设置快捷键
        item5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK)); // 设置快捷键
        item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK)); // 设置快捷键

        menu1.add(item1); // 添加到菜单
        menu1.addSeparator(); // 分隔符
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);

        menu2.add(item4); // 添加到菜单
        menu2.addSeparator(); // 分隔符
        menu2.add(item5);
        menu2.addSeparator();
        menu2.add(item6);

        menu3.add(item7); // 添加到菜单
        menu3.addSeparator(); // 分隔符
        menu3.add(item8);
        menu3.addSeparator();
        menu3.add(item9);

        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        menubar.add(menu5);
        menubar.add(menu6);
        menubar.add(menu7);

        item1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("aaa");
                AddWindowBook addWindowBook = new AddWindowBook();
                Container con = addWindowBook.getContentPane(); // 容器
                con.setBackground(Color.white);
            }
        });

        item2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                AddWindowCD addWindowCD = new AddWindowCD();
                Container con = addWindowCD.getContentPane(); // 容器
                con.setBackground(Color.white);
            }
        });

        item3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                AddWindowPicture addWindowPicture = new AddWindowPicture();
                Container con = addWindowPicture.getContentPane(); // 容器
                con.setBackground(Color.white);
            }
        });

        item4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                TitleSearch titleSearch = new TitleSearch();
                Container con = titleSearch.getContentPane();
                con.setBackground(Color.yellow);
            } // 标题查询
        });

        item5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                NumberSearch numberSearch = new NumberSearch();
                // System.out.println("666");
                Container con = numberSearch.getContentPane();
                con.setBackground(Color.pink);
            } // 编号查询
        });

        item6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                CategorySearch categorySearch = new CategorySearch();
                Container con = categorySearch.getContentPane();
                con.setBackground(Color.green);
            } // 类别查询
        });

        menu4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DeleteWindow deleteWindow = new DeleteWindow();
                Container con = deleteWindow.getContentPane();
                con.setBackground(Color.white);
            } // 删除功能
        });

        menu5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SaveWindow saveWindow = new SaveWindow();
                Container con = saveWindow.getContentPane();
                con.setBackground(Color.white);
            } // 保存功能
        });

        menu6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoadWindow loadWindow = new LoadWindow();
                Container con = loadWindow.getContentPane();
                con.setBackground(Color.white);
            } // 加载功能
        });
    }

    public JMenuBar getMenu() {
        return menubar;
    }
}

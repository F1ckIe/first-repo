//2024.6.24
//by cjm

import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("图书管理系统");
        setSize(650, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗口相关内容

        Menu menu = new Menu(); // 创建菜单
        setJMenuBar(menu.getMenu()); // 设置菜单

        MCStatistic statistic = new MCStatistic(); // 创建面板
        setContentPane(statistic); // 设置面板

        menu.item7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                getContentPane().removeAll();
                MWBookDisplay bookDisplay = new MWBookDisplay();
                setContentPane(bookDisplay);
                revalidate();
                repaint();
            } // 图书页面
        });

        menu.item8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                getContentPane().removeAll();
                MWCDDisplay CDDisplay = new MWCDDisplay();
                setContentPane(CDDisplay);
                revalidate();
                repaint();
            } // CD页面
        });

        menu.item9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                getContentPane().removeAll();
                MWPictureDisplay pictureDisplay = new MWPictureDisplay();
                setContentPane(pictureDisplay);
                revalidate();
                repaint();
            } // 图画页面
        });

        menu.menu7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // System.out.println("555");
                getContentPane().removeAll();
                MCStatistic statistic = new MCStatistic();
                setContentPane(statistic);
                revalidate();
                repaint();
            } // 统计功能
        });

        setVisible(true);
    }
}
//2024.6.24
//by cjm

import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private static MainWindow instance;

    private MainWindow() {
        setTitle("图书管理系统");
        setSize(770, 565);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗口相关内容

        Menu menu = new Menu(); // 创建菜单
        setJMenuBar(menu.getMenu()); // 设置菜单

        MCStatistic statistic = MCStatistic.getInstance(); // 创建面板
        setContentPane(statistic); // 设置面板

        menu.item7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                MWBookDisplay bookDisplay = MWBookDisplay.getInstance();
                setContentPane(bookDisplay);
                revalidate();
                repaint();
            } // 图书页面
        });

        menu.item8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                MWCDDisplay CDDisplay = MWCDDisplay.getInstance();
                setContentPane(CDDisplay);
                revalidate();
                repaint();
            } // CD页面
        });

        menu.item9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                MWPictureDisplay pictureDisplay = MWPictureDisplay.getInstance();
                setContentPane(pictureDisplay);
                revalidate();
                repaint();
            } // 图画页面
        });

        menu.menu7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // System.out.println("555");
                MCStatistic statistic = MCStatistic.getInstance();
                setContentPane(statistic);
                revalidate();
                repaint();
            } // 统计功能
        });

        setVisible(true);
    }

    public static MainWindow getInstance() {
        if (instance == null) {
            instance = new MainWindow();
        }
        return instance;
    }
}
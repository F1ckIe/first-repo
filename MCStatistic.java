//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.*;

public class MCStatistic extends JPanel {
    public MCStatistic() {
        setLayout(new GridBagLayout());
        Font largerFont = new Font("楷体", Font.PLAIN, 40);
        GridBagConstraints gbc = new GridBagConstraints();
        // 计算总物品数
        int totalItems = 10;
        int book = 3;
        int CD = 3;
        int picture = 4;
        // 显示总物品数
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 0, 20);
        JLabel totalLabel = new JLabel("目前图书馆总物品数有 " + totalItems);
        totalLabel.setFont(largerFont);
        add(totalLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 20, 0, 20);
        JLabel categoryLabel1 = new JLabel("目前图书的数量有: " + book);
        categoryLabel1.setFont(largerFont);
        add(categoryLabel1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 20, 0, 20);
        JLabel categoryLabel2 = new JLabel("目前CD的数量有: " + CD);
        categoryLabel2.setFont(largerFont);
        add(categoryLabel2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 20, 0, 20);
        JLabel categoryLabel3 = new JLabel("目前图画的数量有: " + picture);
        categoryLabel3.setFont(largerFont);
        add(categoryLabel3, gbc);
    }
}

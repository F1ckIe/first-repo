//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.*;

public class MCStatistic extends JPanel {

    private static MCStatistic instance;
    JLabel totalLabel;
    JLabel categoryLabel1;
    JLabel categoryLabel2;
    JLabel categoryLabel3;

    MWBookDisplay bookDisplay = MWBookDisplay.getInstance();
    MWCDDisplay cdDisplay = MWCDDisplay.getInstance();
    MWPictureDisplay pictureDisplay = MWPictureDisplay.getInstance();

    int book;
    int CD;
    int picture;
    int totalItems;

    private MCStatistic() {
        setLayout(new GridBagLayout());
        Font largerFont = new Font("楷体", Font.PLAIN, 40);
        GridBagConstraints gbc = new GridBagConstraints();
        book = 0;
        CD = 0;
        picture = 0;
        totalItems = 0;
        // 显示总物品数
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 0, 20);
        totalLabel = new JLabel("目前图书馆总物品数有 " + totalItems);
        totalLabel.setFont(largerFont);
        add(totalLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 20, 0, 20);
        categoryLabel1 = new JLabel("目前图书的数量有: " + book);
        categoryLabel1.setFont(largerFont);
        add(categoryLabel1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 20, 0, 20);
        categoryLabel2 = new JLabel("目前CD的数量有: " + CD);
        categoryLabel2.setFont(largerFont);
        add(categoryLabel2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 20, 0, 20);
        categoryLabel3 = new JLabel("目前图画的数量有: " + picture);
        categoryLabel3.setFont(largerFont);
        add(categoryLabel3, gbc);

        // System.out.println(book);
    }

    public static MCStatistic getInstance() {
        if (instance == null) {
            instance = new MCStatistic();
        }
        return instance;
    }

    void pass() {
        book = bookDisplay.num;
        CD = cdDisplay.num;
        picture = pictureDisplay.num;
        totalItems = book + CD + picture;
        // System.out.println(totalItems);

        totalLabel.setText("目前图书馆总物品数有 " + totalItems);
        categoryLabel1.setText("目前图书的数量有: " + book);
        categoryLabel2.setText("目前CD的数量有: " + CD);
        categoryLabel3.setText("目前图画的数量有: " + picture);

        revalidate();
        repaint();
    }

    void add() {
        totalLabel.setText("目前图书馆总物品数有 " + totalItems);
        categoryLabel1.setText("目前图书的数量有: " + book);
        categoryLabel2.setText("目前CD的数量有: " + CD);
        categoryLabel3.setText("目前图画的数量有: " + picture);

        revalidate();
        repaint();
    }
}

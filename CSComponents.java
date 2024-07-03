//2024.6.25
//by cjm

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class CSComponents extends JPanel {

    NumberCheck check = new NumberCheck();

    public CSComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5; // 水平居中
        c.weighty = 0.5; // 垂直居中

        // 创建和添加组件
        JLabel TSbiaoqian = new JLabel("输入类别");
        Font font = new Font("楷体", Font.PLAIN, 14);
        TSbiaoqian.setFont(font);
        TSbiaoqian.setPreferredSize(new Dimension(60, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(20, 20, 0, 0); // 上下的间距更大以模拟垂直居中
        add(TSbiaoqian);

        String[] items = { "图书", "视频光盘", "图画" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setPreferredSize(new Dimension(60, 20));
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(20, 0, 0, 20);
        add(comboBox);

        JButton button = new JButton("查询");
        c.gridx = 2;
        c.gridy = 0;
        c.insets = new Insets(20, 0, 0, 20);
        button.setPreferredSize(new Dimension(60, 20));
        add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("aaa");
                if (comboBox.getSelectedItem().equals("图书")) {
                    JFrame group = new JFrame("图书管理");
                    group.setSize(770, 365);
                    group.setLocationRelativeTo(null);
                    group.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    MWBookDisplaycopy BookDisplaycopy = MWBookDisplaycopy.getInstance();
                    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                    JButton button2 = new JButton("完成");
                    buttonPanel.add(button2);
                    BookDisplaycopy.add(buttonPanel, BorderLayout.SOUTH);
                    group.setContentPane(BookDisplaycopy);
                    group.revalidate();
                    group.repaint();

                    button2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            // System.out.println("aaa");
                            int flag = 0;
                            int row = BookDisplaycopy.model.getRowCount();
                            int column = BookDisplaycopy.model.getColumnCount();
                            Object[][] data = new Object[row][column];
                            MWBookDisplay book = MWBookDisplay.getInstance();
                            // Object[][] value = new Object[row][column];
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < column; j++) {
                                    data[i][j] = BookDisplaycopy.model.getValueAt(i, j);
                                    // System.out.println(data[i][j]);
                                }
                                if (check.compare((String) data[i][0]) && !(data[i][0]
                                        .equals(book.getModel().getValueAt(i, 0)))) {
                                    JFrame cue = new JFrame("提示");
                                    cue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    cue.setSize(400, 140);
                                    cue.setLocationRelativeTo(null);

                                    JPanel AWcomponents = new JPanel(new FlowLayout());
                                    JLabel AWtishi = new JLabel("编号与已有数据重复，请重新填写");
                                    JButton AWbutton1 = new JButton("确认");
                                    AWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
                                    AWcomponents.add(AWtishi);
                                    AWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
                                    AWcomponents.add(AWbutton1);
                                    cue.setContentPane(AWcomponents);

                                    AWbutton1.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseReleased(MouseEvent e) {
                                            // System.out.println("666");
                                            cue.dispose();
                                        }
                                    });

                                    flag = 1;

                                    cue.setVisible(true);
                                }
                            }
                            if (flag == 0) {
                                for (int i = 0; i < row; i++) {
                                    for (int j = 0; j < column; j++) {
                                        book.getModel().setValueAt(data[i][j], i, j);
                                        // value[i][j] = book.model.getValueAt(i, j);
                                        // System.out.println(value[i][j]);
                                        book.model.fireTableDataChanged();
                                    }
                                }
                            }
                        }
                    });

                    group.setVisible(true);
                } else if (comboBox.getSelectedItem().equals("视频光盘")) {
                    JFrame group = new JFrame("视频光盘管理");
                    group.setSize(770, 365);
                    group.setLocationRelativeTo(null);
                    group.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    MWCDDisplaycopy CDDisplay = MWCDDisplaycopy.getInstance();
                    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                    JButton button2 = new JButton("完成");
                    buttonPanel.add(button2);
                    CDDisplay.add(buttonPanel, BorderLayout.SOUTH);
                    group.setContentPane(CDDisplay);
                    group.revalidate();
                    group.repaint();

                    button2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            // System.out.println("aaa");
                            int row = CDDisplay.model.getRowCount();
                            int column = CDDisplay.model.getColumnCount();
                            Object[][] data = new Object[row][column];
                            MWCDDisplay CD = MWCDDisplay.getInstance();
                            // Object[][] value = new Object[row][column];
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < column; j++) {
                                    data[i][j] = CDDisplay.model.getValueAt(i, j);
                                    // System.out.println(data[i][j]);
                                }
                            }
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < column; j++) {
                                    CD.getModel().setValueAt(data[i][j], i, j);
                                    // value[i][j] = book.model.getValueAt(i, j);
                                    // System.out.println(value[i][j]);
                                    CD.model.fireTableDataChanged();
                                }
                            }
                        }
                    });

                    group.setVisible(true);
                } else if (comboBox.getSelectedItem().equals("图画")) {
                    JFrame group = new JFrame("图画管理");
                    group.setSize(770, 365);
                    group.setLocationRelativeTo(null);
                    group.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    MWPictureDisplaycopy pictureDisplay = MWPictureDisplaycopy.getInstance();
                    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                    JButton button2 = new JButton("完成");
                    buttonPanel.add(button2);
                    pictureDisplay.add(buttonPanel, BorderLayout.SOUTH);
                    group.setContentPane(pictureDisplay);
                    group.revalidate();
                    group.repaint();

                    button2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            // System.out.println("aaa");
                            int row = pictureDisplay.model.getRowCount();
                            int column = pictureDisplay.model.getColumnCount();
                            Object[][] data = new Object[row][column];
                            // Object[][] value = new Object[row][column];
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < column; j++) {
                                    data[i][j] = pictureDisplay.model.getValueAt(i, j);
                                    // System.out.println(data[i][j]);
                                }
                            }
                            MWPictureDisplay CD = MWPictureDisplay.getInstance();
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < column; j++) {
                                    CD.getModel().setValueAt(data[i][j], i, j);
                                    // value[i][j] = book.model.getValueAt(i, j);
                                    // System.out.println(value[i][j]);
                                    CD.model.fireTableDataChanged();
                                }
                            }
                        }
                    });

                    group.setVisible(true);
                }
            }
        });
    }
}

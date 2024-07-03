//2024.6.25
//by cjm

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.*;

public class NSComponents extends JPanel {

    private static NSComponents instance;

    String[] value1;
    String[] value2;
    String[] value3;
    JFrame result;
    int result1;
    int result2;
    int result3;

    private NSComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5; // 水平居中
        c.weighty = 0.5; // 垂直居中

        // 创建和添加组件
        JLabel TSbiaoqian = new JLabel("输入编号");
        Font font = new Font("楷体", Font.PLAIN, 14);
        TSbiaoqian.setFont(font);
        TSbiaoqian.setPreferredSize(new Dimension(60, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(20, 20, 0, 0); // 上下的间距更大以模拟垂直居中
        add(TSbiaoqian);

        JTextField TStext = new JTextField(13);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(20, 0, 0, 20);
        add(TStext);

        JButton button = new JButton("查询");
        c.gridx = 2;
        c.gridy = 0;
        c.insets = new Insets(20, 0, 0, 20);
        button.setPreferredSize(new Dimension(60, 20));
        add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int flag = 0;

                String aim = TStext.getText();
                int columnIndex = 0;

                MWBookDisplay BookDisplay = MWBookDisplay.getInstance();
                DefaultTableModel model1 = BookDisplay.getModel();
                int ColumnCount1 = model1.getColumnCount();
                int RowCount1 = model1.getRowCount();
                Object[] columnData1 = new Object[RowCount1];
                value1 = new String[ColumnCount1];
                for (int i = 0; i < RowCount1; i++) {
                    columnData1[i] = model1.getValueAt(i, columnIndex);
                    if (aim.equals(columnData1[i])) {
                        flag = 1;
                        result1 = i;
                        for (int j = 0; j < ColumnCount1; j++) {
                            value1[j] = (String) model1.getValueAt(i, j);
                        }
                        result = new JFrame("查找结果");
                        result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        result.setSize(400, 270);
                        result.setLocationRelativeTo(null);

                        BookNumberResult components = new BookNumberResult();
                        result.setContentPane(components);

                        result.setVisible(true);
                    }
                }

                MWCDDisplay CDDisplay = MWCDDisplay.getInstance();
                DefaultTableModel model2 = CDDisplay.getModel();
                int ColumnCount2 = model2.getColumnCount();
                int RowCount2 = model2.getRowCount();
                Object[] columnData2 = new Object[RowCount2];
                value2 = new String[ColumnCount2];
                for (int i = 0; i < RowCount2; i++) {
                    columnData2[i] = model2.getValueAt(i, columnIndex);
                    if (aim.equals(columnData2[i])) {
                        flag = 1;
                        result2 = i;
                        for (int j = 0; j < ColumnCount2; j++) {
                            value2[j] = (String) model2.getValueAt(i, j);
                        }
                        result = new JFrame("查找结果");
                        result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        result.setSize(400, 270);
                        result.setLocationRelativeTo(null);

                        NumberResult components = new NumberResult();
                        result.setContentPane(components);

                        result.setVisible(true);
                    }
                }

                MWPictureDisplay PictureDisplay = MWPictureDisplay.getInstance();
                DefaultTableModel model3 = PictureDisplay.getModel();
                int ColumnCount3 = model3.getColumnCount();
                int RowCount3 = model3.getRowCount();
                Object[] columnData3 = new Object[RowCount3];
                value3 = new String[ColumnCount3];
                for (int i = 0; i < RowCount3; i++) {
                    columnData3[i] = model3.getValueAt(i, columnIndex);
                    if (aim.equals(columnData3[i])) {
                        flag = 1;
                        result3 = i;
                        for (int j = 0; j < ColumnCount3; j++) {
                            value3[j] = (String) model3.getValueAt(i, j);
                        }
                        result = new JFrame("查找结果");
                        result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        result.setSize(400, 270);
                        result.setLocationRelativeTo(null);

                        PictureNumberResult components = new PictureNumberResult();
                        result.setContentPane(components);

                        result.setVisible(true);
                    }
                }

                if (flag == 0) {
                    JFrame cue = new JFrame("提示");
                    cue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    cue.setSize(400, 140);
                    cue.setLocationRelativeTo(null);

                    JPanel AWcomponents = new JPanel(new FlowLayout());
                    JLabel AWtishi = new JLabel("该编号不存在！");
                    JButton AWbutton1 = new JButton("确认");
                    AWcomponents.add(Box.createRigidArea(new Dimension(120, 45)));
                    AWcomponents.add(AWtishi);
                    AWcomponents.add(Box.createRigidArea(new Dimension(120, 45)));
                    AWcomponents.add(AWbutton1);
                    cue.setContentPane(AWcomponents);

                    AWbutton1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            // System.out.println("666");
                            cue.dispose();
                        }
                    });

                    cue.setVisible(true);
                    ;
                }
                // System.out.println("666");
            } // 类别查询
        });
    }

    public static NSComponents getInstance() {
        if (instance == null) {
            instance = new NSComponents();
        }
        return instance;
    }
}

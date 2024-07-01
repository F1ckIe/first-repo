//2024.6.25
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddWindowBook extends JFrame {
    public AddWindowBook() {
        setTitle("添加图书");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 270);
        setLocationRelativeTo(null);

        JPanel contentPane1 = new JPanel(new FlowLayout());
        JLabel AWBbianhao1 = new JLabel("请设置编号");
        JTextField AWBtext1 = new JTextField(13);
        JLabel AWBbianhao2 = new JLabel("请输入标题");
        JTextField AWBtext2 = new JTextField(13);
        JLabel AWBbianhao3 = new JLabel("请输入作者");
        JTextField AWBtext3 = new JTextField(13);
        JLabel AWBbianhao4 = new JLabel("请填写评级");
        ButtonGroup group = new ButtonGroup();
        JRadioButton weipingji = new JRadioButton("未评级");
        JRadioButton yiban = new JRadioButton("一般");
        JRadioButton chengren = new JRadioButton("成人");
        JRadioButton ertong = new JRadioButton("儿童");
        JButton AWBbutton = new JButton("添加");
        group.add(weipingji);
        group.add(yiban);
        group.add(chengren);
        group.add(ertong);
        // 添加组件到窗口
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(AWBbianhao1);
        contentPane1.add(AWBtext1);
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(AWBbianhao2);
        contentPane1.add(AWBtext2);
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(AWBbianhao3);
        contentPane1.add(AWBtext3);
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(Box.createRigidArea(new Dimension(30, 0)));
        contentPane1.add(AWBbianhao4);
        contentPane1.add(weipingji);
        contentPane1.add(yiban);
        contentPane1.add(chengren);
        contentPane1.add(ertong);
        contentPane1.add(Box.createRigidArea(new Dimension(30, 0)));

        JLabel AWBbianhao5 = new JLabel("请输入出版社");
        JTextField AWBtext5 = new JTextField(13);
        JLabel AWBbianhao6 = new JLabel("请输入ISBN号");
        JTextField AWBtext6 = new JTextField(13);
        JLabel AWBbianhao7 = new JLabel("请输入页数");
        JTextField AWBtext7 = new JTextField(13);
        contentPane1.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane1.add(AWBbianhao5);
        contentPane1.add(AWBtext5);
        contentPane1.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane1.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane1.add(AWBbianhao6);
        contentPane1.add(AWBtext6);
        contentPane1.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(AWBbianhao7);
        contentPane1.add(AWBtext7);
        contentPane1.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane1.add(AWBbutton);
        setContentPane(contentPane1);

        AWBbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                String number = AWBtext1.getText(); // 获取编号
                NumberCheck check = new NumberCheck();
                if (check.compare(number)) {
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

                    cue.setVisible(true);
                } else {
                    Object[] rowData = new Object[7];
                    rowData[0] = AWBtext1.getText();
                    rowData[1] = AWBtext2.getText();
                    rowData[2] = AWBtext3.getText();

                    if (weipingji.isSelected()) {
                        rowData[3] = weipingji.getText();
                    } else if (yiban.isSelected()) {
                        rowData[3] = yiban.getText();
                    } else if (chengren.isSelected()) {
                        rowData[3] = chengren.getText();
                    } else if (ertong.isSelected()) {
                        rowData[3] = ertong.getText();
                    }

                    rowData[4] = AWBtext5.getText();
                    rowData[5] = AWBtext6.getText();
                    rowData[6] = AWBtext7.getText();

                    MWBookDisplay.getInstance().model.addRow(rowData);

                    MainWindow temp = MainWindow.getInstance();
                    MWBookDisplay bookDisplay = MWBookDisplay.getInstance();
                    temp.setContentPane(bookDisplay);
                    temp.revalidate();
                    temp.repaint(); // 切换到图书界面

                    dispose();
                }
            }
        });

        setVisible(true);
    }
}

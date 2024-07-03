//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddWindowCD extends JFrame {
    public AddWindowCD() {
        setTitle("添加视频光盘");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel contentPane2 = new JPanel(new FlowLayout());
        JLabel AWCbianhao1 = new JLabel("请设置编号");
        JTextField AWCtext1 = new JTextField(13);
        JLabel AWCbianhao2 = new JLabel("请输入标题");
        JTextField AWCtext2 = new JTextField(13);
        JLabel AWCbianhao3 = new JLabel("请输入作者");
        JTextField AWCtext3 = new JTextField(13);
        JLabel AWCbianhao4 = new JLabel("请填写评级");
        ButtonGroup group = new ButtonGroup();
        JRadioButton weipingji = new JRadioButton("未评级");
        JRadioButton yiban = new JRadioButton("一般");
        JRadioButton chengren = new JRadioButton("成人");
        JRadioButton ertong = new JRadioButton("儿童");
        JButton AWCbutton = new JButton("添加");
        group.add(weipingji);
        group.add(yiban);
        group.add(chengren);
        group.add(ertong);
        // 添加组件到窗口
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(AWCbianhao1);
        contentPane2.add(AWCtext1);
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(AWCbianhao2);
        contentPane2.add(AWCtext2);
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(AWCbianhao3);
        contentPane2.add(AWCtext3);
        contentPane2.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane2.add(Box.createRigidArea(new Dimension(30, 0)));
        contentPane2.add(AWCbianhao4);
        contentPane2.add(weipingji);
        contentPane2.add(yiban);
        contentPane2.add(chengren);
        contentPane2.add(ertong);
        contentPane2.add(Box.createRigidArea(new Dimension(30, 0)));

        JLabel AWCbianhao5 = new JLabel("请输入出品者");
        JTextField AWCtext5 = new JTextField(13);
        JLabel AWCbianhao6 = new JLabel("请输入出品年份");
        JTextField AWCtext6 = new JTextField(13);
        JLabel AWCbianhao7 = new JLabel("请输入视频时长");
        JTextField AWCtext7 = new JTextField(13);
        contentPane2.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane2.add(AWCbianhao5);
        contentPane2.add(AWCtext5);
        contentPane2.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane2.add(Box.createRigidArea(new Dimension(70, 0)));
        contentPane2.add(AWCbianhao6);
        contentPane2.add(AWCtext6);
        contentPane2.add(Box.createRigidArea(new Dimension(70, 0)));
        contentPane2.add(Box.createRigidArea(new Dimension(60, 0)));
        contentPane2.add(AWCbianhao7);
        contentPane2.add(AWCtext7);
        contentPane2.add(Box.createRigidArea(new Dimension(60, 0)));
        contentPane2.add(AWCbutton);
        setContentPane(contentPane2);

        AWCbutton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("666");
                String number = AWCtext1.getText(); // 获取编号
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
                    rowData[0] = AWCtext1.getText();
                    rowData[1] = AWCtext2.getText();
                    rowData[2] = AWCtext3.getText();

                    if (weipingji.isSelected()) {
                        rowData[3] = weipingji.getText();
                    } else if (yiban.isSelected()) {
                        rowData[3] = yiban.getText();
                    } else if (chengren.isSelected()) {
                        rowData[3] = chengren.getText();
                    } else if (ertong.isSelected()) {
                        rowData[3] = ertong.getText();
                    }

                    rowData[4] = AWCtext5.getText();
                    rowData[5] = AWCtext6.getText();
                    rowData[6] = AWCtext7.getText();

                    MWCDDisplay.getInstance().model.addRow(rowData);
                    MWCDDisplaycopy.getInstance().model.addRow(rowData);

                    MainWindow temp = MainWindow.getInstance();
                    MWCDDisplay CDDisplay = MWCDDisplay.getInstance();
                    temp.setContentPane(CDDisplay);
                    temp.revalidate();
                    temp.repaint(); // 切换到CD界面

                    MCStatistic.getInstance().totalItems += 1;
                    MCStatistic.getInstance().CD += 1;
                    MCStatistic.getInstance().add();

                    dispose();
                }
            }
        });

        setVisible(true);
    }
}

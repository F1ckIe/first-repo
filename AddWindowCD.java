//2024.6.26
//by cjm

import javax.swing.*;
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

        setVisible(true);
    }
}

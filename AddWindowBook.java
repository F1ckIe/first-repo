//2024.6.25
//by cjm

import javax.swing.*;
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

        setVisible(true);
    }
}

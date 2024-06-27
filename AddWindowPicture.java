//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.*;

public class AddWindowPicture extends JFrame {
    public AddWindowPicture() {
        setTitle("添加图画");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel contentPane3 = new JPanel(new FlowLayout());
        JLabel AWPbianhao1 = new JLabel("请设置编号");
        JTextField AWPtext1 = new JTextField(13);
        JLabel AWPbianhao2 = new JLabel("请输入标题");
        JTextField AWPtext2 = new JTextField(13);
        JLabel AWPbianhao3 = new JLabel("请输入作者");
        JTextField AWPtext3 = new JTextField(13);
        JLabel AWPbianhao4 = new JLabel("请填写评级");
        ButtonGroup group = new ButtonGroup();
        JRadioButton weipingji = new JRadioButton("未评级");
        JRadioButton yiban = new JRadioButton("一般");
        JRadioButton chengren = new JRadioButton("成人");
        JRadioButton ertong = new JRadioButton("儿童");
        JButton AWPbutton = new JButton("添加");
        group.add(weipingji);
        group.add(yiban);
        group.add(chengren);
        group.add(ertong);
        // 添加组件到窗口
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(AWPbianhao1);
        contentPane3.add(AWPtext1);
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(AWPbianhao2);
        contentPane3.add(AWPtext2);
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(AWPbianhao3);
        contentPane3.add(AWPtext3);
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(Box.createRigidArea(new Dimension(30, 0)));
        contentPane3.add(AWPbianhao4);
        contentPane3.add(weipingji);
        contentPane3.add(yiban);
        contentPane3.add(chengren);
        contentPane3.add(ertong);
        contentPane3.add(Box.createRigidArea(new Dimension(30, 0)));

        JLabel AWPbianhao5 = new JLabel("请输入出品国籍");
        JTextField AWPtext5 = new JTextField(13);
        JLabel AWPbianhao6 = new JLabel("请输入长度");
        JTextField AWPtext6 = new JTextField(13);
        JLabel AWPbianhao7 = new JLabel("请输入宽度");
        JTextField AWPtext7 = new JTextField(13);
        contentPane3.add(Box.createRigidArea(new Dimension(70, 0)));
        contentPane3.add(AWPbianhao5);
        contentPane3.add(AWPtext5);
        contentPane3.add(Box.createRigidArea(new Dimension(70, 0)));
        contentPane3.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane3.add(AWPbianhao6);
        contentPane3.add(AWPtext6);
        contentPane3.add(Box.createRigidArea(new Dimension(80, 0)));
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(AWPbianhao7);
        contentPane3.add(AWPtext7);
        contentPane3.add(Box.createRigidArea(new Dimension(90, 0)));
        contentPane3.add(AWPbutton);
        setContentPane(contentPane3);

        setVisible(true);
    }
}

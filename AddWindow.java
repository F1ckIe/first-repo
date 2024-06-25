//2024.6.25
//by cjm

import javax.swing.*;
import java.awt.*;

public class AddWindow extends JFrame {
    public AddWindow() {
        setTitle("添加物品");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(new FlowLayout());
        JLabel AWbianhao1 = new JLabel("请设置编号");
        JTextField AWtext1 = new JTextField(13);
        JLabel AWbianhao2 = new JLabel("请输入标题");
        JTextField AWtext2 = new JTextField(13);
        JLabel AWbianhao3 = new JLabel("请输入作者");
        JTextField AWtext3 = new JTextField(13);
        JLabel AWbianhao4 = new JLabel("请填入评级");
        JTextField AWtext4 = new JTextField(13);
        // 添加组件到窗口
        contentPane.add(AWbianhao1);
        contentPane.add(AWtext1);
        contentPane.add(AWbianhao2);
        contentPane.add(AWtext2);
        contentPane.add(AWbianhao3);
        contentPane.add(AWtext3);
        contentPane.add(AWbianhao4);
        contentPane.add(AWtext4);
        setContentPane(contentPane);
    }
}

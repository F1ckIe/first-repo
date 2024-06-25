//2024.6.25
//by cjm

import javax.swing.*;
import java.awt.*;

public class TSComponents extends JPanel {
    public TSComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5; // 水平居中
        c.weighty = 0.5; // 垂直居中

        // 创建和添加组件
        JLabel TSbiaoqian = new JLabel("输入标题");
        Font font = new Font("宋体", Font.PLAIN, 14);
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
    }
}

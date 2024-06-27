//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.*;

public class MainComponents extends JPanel {
    public MainComponents() {
        // 设置布局管理器
        setLayout(new FlowLayout());

        // 创建和添加组件
        JButton button = new JButton("主页面");
        add(button);
    }
}

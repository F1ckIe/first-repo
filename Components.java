//2024.6.24
//by cjm

import javax.swing.*;
import java.awt.*;

public class Components extends JPanel {
    public Components() {
        // 设置布局管理器
        setLayout(new FlowLayout());

        // 创建和添加组件
        JButton button = new JButton("点击我");
        add(button);
    }
}

//2024.6.27
//by cjm

import javax.swing.*;
import java.awt.*;

public class LoadWindow extends JFrame {
    public LoadWindow() {
        setTitle("物品加载");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 140);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel SWcomponents = new JPanel(new FlowLayout());
        JLabel SWtishi = new JLabel("将读取本地的数据，是否确认");
        JButton SWbutton1 = new JButton("确认");
        JButton SWbutton2 = new JButton("取消");
        SWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
        SWcomponents.add(SWtishi);
        SWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
        SWcomponents.add(SWbutton1);
        SWcomponents.add(Box.createRigidArea(new Dimension(50, 0)));
        SWcomponents.add(SWbutton2);
        setContentPane(SWcomponents);
    }
}

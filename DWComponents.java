//2024.6.27
//by cjm

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class DWComponents extends JPanel {
    public DWComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5; // 水平居中
        c.weighty = 0.5; // 垂直居中

        // 创建和添加组件
        JLabel TSbiaoqian = new JLabel("输入编号");
        Font font = new Font("楷体", Font.PLAIN, 14);
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

        JButton button = new JButton("删除");
        c.gridx = 2;
        c.gridy = 0;
        c.insets = new Insets(20, 0, 0, 20);
        button.setPreferredSize(new Dimension(60, 20));
        add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("aaa");
                int flag1 = 1;
                int flag2 = 1;
                int flag3 = 1;
                String str = TStext.getText();
                flag1 = MWBookDisplay.getInstance().dede(str);
                flag2 = MWCDDisplay.getInstance().dede(str);
                flag3 = MWPictureDisplay.getInstance().dede(str);
                if (flag1 == 1 && flag2 == 1 && flag3 == 1) {
                    {
                        JFrame cue = new JFrame("提示");
                        cue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        cue.setSize(400, 140);
                        cue.setLocationRelativeTo(null);

                        JPanel AWcomponents = new JPanel(new FlowLayout());
                        JLabel AWtishi = new JLabel("该编号不存在！");
                        JButton AWbutton1 = new JButton("确认");
                        AWcomponents.add(Box.createRigidArea(new Dimension(120, 45)));
                        AWcomponents.add(AWtishi);
                        AWcomponents.add(Box.createRigidArea(new Dimension(120, 45)));
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
                    }
                }
            }
        });
    }
}

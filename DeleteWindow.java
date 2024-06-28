//2024.6.27
//by cjm

import javax.swing.*;

public class DeleteWindow extends JFrame {
    public DeleteWindow() {
        setTitle("删除物品");
        setSize(400, 140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DWComponents components = new DWComponents();
        setContentPane(components);

        setVisible(true);
    }
}

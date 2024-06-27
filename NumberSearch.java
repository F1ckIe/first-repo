//2024.6.25
//by cjm

import javax.swing.JFrame;

public class NumberSearch extends JFrame {
    public NumberSearch() {
        setTitle("编号查询");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 140);
        setLocationRelativeTo(null);
        NSComponents components = new NSComponents();
        setContentPane(components);

        setVisible(true);
    }
}

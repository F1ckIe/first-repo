//2024.6.25
//by cjm

import javax.swing.*;

public class TitleSearch extends JFrame {
    public TitleSearch() {
        setTitle("标题查询");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 140);
        setLocationRelativeTo(null);
        TSComponents components = new TSComponents();
        setContentPane(components);

        setVisible(true);
    }
}
//2024.6.25
//by cjm

import javax.swing.JFrame;

public class CategorySearch extends JFrame {
    public CategorySearch() {
        setTitle("类别查询");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 140);
        setLocationRelativeTo(null);
        CSComponents components = new CSComponents();
        setContentPane(components);

        setVisible(true);
    }
}

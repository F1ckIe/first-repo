import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class table extends JPanel {
    public static void main(String[] args) {
        String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
        Object[][] data = {
                { "Kathy", "Smith", "Snowboarding", 5, false },
                { "John", "Doe", "Rowing", 3, true },
                // ... 更多数据行
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // 创建 JTable 并设置模型
        JTable table = new JTable(model);

        // 禁止表格编辑

        // 将表格放入滚动面板中
        JScrollPane scrollPane = new JScrollPane(table);

        // 创建 JFrame 并添加滚动面板
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // 居中显示
        frame.setVisible(true);
    }
}

//2024.6.27
//by cjm

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class MWBookDisplay extends JPanel {
    public MWBookDisplay() {
        setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] columnNames = { "编号", "标题", "作者", "评级", "出版社", "ISBN号", "页数" };
        model.setColumnIdentifiers(columnNames);
        for (int i = 0; i < 30; i++) {
            Object[] rowData = new Object[7];
            model.addRow(rowData);
        }
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER); // 使用JScrollPane包装JTable以提供滚动功能
    }

}

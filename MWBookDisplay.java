//2024.6.27
//by cjm

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.awt.*;

public class MWBookDisplay extends JPanel {

    private static MWBookDisplay instance;

    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    Object[] rowData;
    int num = 0;

    private MWBookDisplay() {
        setLayout(new BorderLayout());
        String[] columnNames = { "编号", "标题", "作者", "评级", "出版社", "ISBN号", "页数" };
        model.setColumnIdentifiers(columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER); // 使用JScrollPane包装JTable以提供滚动功能
    }

    public static MWBookDisplay getInstance() {
        if (instance == null) {
            instance = new MWBookDisplay();
        }
        return instance;
    }

    void pass() {
        String BookFile = "Book.txt";
        model.setRowCount(0);// 每次读取从第一行开始
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(BookFile), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                rowData = new Object[7];
                for (int i = 0; i < 7; i++) {
                    rowData[i] = values[i];
                }
                model.addRow(rowData);
                MainWindow temp = MainWindow.getInstance();
                temp.revalidate();
                temp.repaint();
                num++;
                // System.out.println(rowData[5]);
            }
            model.fireTableDataChanged(); // 通知表格数据已更改
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

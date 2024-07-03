//2024.6.27
//by cjm

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MWCDDisplay extends JPanel {

    private static MWCDDisplay instance;
    DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false; // 总是返回false，表示没有单元格是可编辑的
        }
    };

    Object[] rowData;
    int num = 0;
    JTable table;

    private MWCDDisplay() {
        setLayout(new BorderLayout());
        String[] columnNames = { "编号", "标题", "作者", "评级", "出品者", "出品年份", "视频时长" };
        model.setColumnIdentifiers(columnNames);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER); // 使用JScrollPane包装JTable以提供滚动功能
    }

    public static MWCDDisplay getInstance() {
        if (instance == null) {
            instance = new MWCDDisplay();
        }
        return instance;
    }

    void pass() {
        String BookFile = "CD.txt";
        model.setRowCount(0);// 每次读取从第一行开始
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(BookFile), "UTF-8"))) {
            String line;
            num = 0;
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
                // System.out.println(values[5]);
            }
            model.fireTableDataChanged(); // 通知表格数据已更改
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public int dede(String m) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (m.equals(model.getValueAt(i, 0))) {
                model.removeRow(i);
                return 0;
            }
        }
        return 1;
    }

    void saving() {
        String fileName = "CD.txt";
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName), "UTF-8"))) {
            for (int row = 0; row < table.getRowCount(); row++) {
                for (int col = 0; col < table.getColumnCount(); col++) {
                    writer.write(table.getValueAt(row, col).toString());
                    if (col < table.getColumnCount() - 1) {
                        writer.write(" "); // 使用逗号作为分隔符，你可以根据需要更改为其他字符
                    }
                }
                writer.newLine(); // 写入行尾，进入下一行
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
        }
    }
}

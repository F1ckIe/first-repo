//2024.7.2
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BookNumberResult extends JPanel {
    public BookNumberResult() {
        NSComponents temp = NSComponents.getInstance();
        // System.out.println("666");
        setLayout(new FlowLayout());
        JLabel bianhao = new JLabel("编号");
        JTextField bianhaotext = new JTextField(13);
        bianhaotext.setText(temp.value1[0]);
        bianhaotext.setEditable(false);
        JLabel biaoti = new JLabel("标题");
        JTextField biaotitext = new JTextField(13);
        biaotitext.setText(temp.value1[1]);
        biaotitext.setEditable(false);
        JLabel zuozhe = new JLabel("作者");
        JTextField zuozhetext = new JTextField(13);
        zuozhetext.setText(temp.value1[2]);
        zuozhetext.setEditable(false);
        JLabel pinji = new JLabel("评级");
        String[] items = { "未评级", "一般", "成人", "儿童" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(temp.value1[3])) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
        comboBox.setEnabled(false);
        JButton button1 = new JButton("编辑");
        JButton button2 = new JButton("完成");
        // 添加组件到窗口
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(bianhao);
        add(bianhaotext);
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(biaoti);
        add(biaotitext);
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(zuozhe);
        add(zuozhetext);
        add(Box.createRigidArea(new Dimension(110, 0)));
        add(Box.createRigidArea(new Dimension(90, 0)));
        add(pinji);
        add(comboBox);
        add(Box.createRigidArea(new Dimension(90, 0)));

        JLabel chubanshe = new JLabel("出版社");
        JTextField chubanshetext = new JTextField(13);
        chubanshetext.setText(temp.value1[4]);
        chubanshetext.setEditable(false);
        JLabel ISBN = new JLabel("ISBN号");
        JTextField ISBNtext = new JTextField(13);
        ISBNtext.setText(temp.value1[5]);
        ISBNtext.setEditable(false);
        JLabel yeshu = new JLabel("页数");
        JTextField yeshutext = new JTextField(13);
        yeshutext.setText(temp.value1[6]);
        yeshutext.setEditable(false);
        add(Box.createRigidArea(new Dimension(100, 0)));
        add(chubanshe);
        add(chubanshetext);
        add(Box.createRigidArea(new Dimension(100, 0)));
        add(Box.createRigidArea(new Dimension(90, 0)));
        add(ISBN);
        add(ISBNtext);
        add(Box.createRigidArea(new Dimension(90, 0)));
        add(Box.createRigidArea(new Dimension(80, 0)));
        add(yeshu);
        add(yeshutext);
        add(Box.createRigidArea(new Dimension(80, 0)));
        add(button1);
        add(Box.createRigidArea(new Dimension(40, 0)));
        add(button2);

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("aaa");
                bianhaotext.setEditable(true);
                biaotitext.setEditable(true);
                zuozhetext.setEditable(true);
                comboBox.setEnabled(true);
                chubanshetext.setEditable(true);
                ISBNtext.setEditable(true);
                yeshutext.setEditable(true);

                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        // System.out.println("aaa");
                        MWBookDisplay BookDisplay = MWBookDisplay.getInstance();
                        MWBookDisplaycopy BookDisplaycopy = MWBookDisplaycopy.getInstance();
                        NumberCheck check = new NumberCheck();
                        if ((check.compare(bianhaotext.getText()))
                                && !(bianhaotext.getText()
                                        .equals(BookDisplay.getModel().getValueAt(temp.result1, 0)))) {
                            JFrame cue = new JFrame("提示");
                            cue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            cue.setSize(400, 140);
                            cue.setLocationRelativeTo(null);

                            JPanel AWcomponents = new JPanel(new FlowLayout());
                            JLabel AWtishi = new JLabel("编号与已有数据重复，请重新填写");
                            JButton AWbutton1 = new JButton("确认");
                            AWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
                            AWcomponents.add(AWtishi);
                            AWcomponents.add(Box.createRigidArea(new Dimension(90, 45)));
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
                        } else {
                            BookDisplay.getModel().setValueAt(bianhaotext.getText(), temp.result2, 0);
                            BookDisplay.getModel().setValueAt(biaotitext.getText(), temp.result2, 1);
                            BookDisplay.getModel().setValueAt(zuozhetext.getText(), temp.result2, 2);
                            BookDisplay.getModel().setValueAt(comboBox.getSelectedItem(), temp.result2, 3);
                            BookDisplay.getModel().setValueAt(chubanshetext.getText(), temp.result2, 4);
                            BookDisplay.getModel().setValueAt(ISBNtext.getText(), temp.result2, 5);
                            BookDisplay.getModel().setValueAt(yeshutext.getText(), temp.result2, 6);

                            BookDisplaycopy.getModel().setValueAt(bianhaotext.getText(), temp.result2, 0);
                            BookDisplaycopy.getModel().setValueAt(biaotitext.getText(), temp.result2, 1);
                            BookDisplaycopy.getModel().setValueAt(zuozhetext.getText(), temp.result2, 2);
                            BookDisplaycopy.getModel().setValueAt(comboBox.getSelectedItem(), temp.result2, 3);
                            BookDisplaycopy.getModel().setValueAt(chubanshetext.getText(), temp.result2, 4);
                            BookDisplaycopy.getModel().setValueAt(ISBNtext.getText(), temp.result2, 5);
                            BookDisplaycopy.getModel().setValueAt(yeshutext.getText(), temp.result2, 6);
                        }
                    }
                });
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("aaa");
                temp.result.dispose();
            }
        });
    }
}

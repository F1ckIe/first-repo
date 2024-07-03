//2024.7.2
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CDTitleResult extends JPanel {
    public CDTitleResult() {
        TSComponents temp = TSComponents.getInstance();
        // System.out.println("666");
        setLayout(new FlowLayout());
        JLabel bianhao = new JLabel("编号");
        JTextField bianhaotext = new JTextField(13);
        bianhaotext.setText(temp.value2[0]);
        bianhaotext.setEditable(false);
        JLabel biaoti = new JLabel("标题");
        JTextField biaotitext = new JTextField(13);
        biaotitext.setText(temp.value2[1]);
        biaotitext.setEditable(false);
        JLabel zuozhe = new JLabel("作者");
        JTextField zuozhetext = new JTextField(13);
        zuozhetext.setText(temp.value2[2]);
        zuozhetext.setEditable(false);
        JLabel pinji = new JLabel("评级");
        String[] items = { "未评级", "一般", "成人", "儿童" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(temp.value2[3])) {
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

        JLabel chupinzhe = new JLabel("出品者");
        JTextField chupinzhetext = new JTextField(13);
        chupinzhetext.setText(temp.value2[4]);
        chupinzhetext.setEditable(false);
        JLabel nianfen = new JLabel("出品年份");
        JTextField nianfentext = new JTextField(13);
        nianfentext.setText(temp.value2[5]);
        nianfentext.setEditable(false);
        JLabel shichang = new JLabel("视频时长");
        JTextField shichangtext = new JTextField(13);
        shichangtext.setText(temp.value2[6]);
        shichangtext.setEditable(false);
        add(Box.createRigidArea(new Dimension(100, 0)));
        add(chupinzhe);
        add(chupinzhetext);
        add(Box.createRigidArea(new Dimension(100, 0)));
        add(Box.createRigidArea(new Dimension(90, 0)));
        add(nianfen);
        add(nianfentext);
        add(Box.createRigidArea(new Dimension(90, 0)));
        add(Box.createRigidArea(new Dimension(80, 0)));
        add(shichang);
        add(shichangtext);
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
                chupinzhetext.setEditable(true);
                nianfentext.setEditable(true);
                shichangtext.setEditable(true);

                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        // System.out.println("aaa");
                        MWCDDisplay CDDisplay = MWCDDisplay.getInstance();
                        MWCDDisplaycopy CDDisplaycopy = MWCDDisplaycopy.getInstance();
                        NumberCheck check = new NumberCheck();
                        if ((check.compare(bianhaotext.getText()))
                                && !(bianhaotext.getText().equals(CDDisplay.getModel().getValueAt(temp.result2, 0)))) {
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
                            CDDisplay.getModel().setValueAt(bianhaotext.getText(), temp.result2, 0);
                            CDDisplay.getModel().setValueAt(biaotitext.getText(), temp.result2, 1);
                            CDDisplay.getModel().setValueAt(zuozhetext.getText(), temp.result2, 2);
                            CDDisplay.getModel().setValueAt(comboBox.getSelectedItem(), temp.result2, 3);
                            CDDisplay.getModel().setValueAt(chupinzhetext.getText(), temp.result2, 4);
                            CDDisplay.getModel().setValueAt(nianfentext.getText(), temp.result2, 5);
                            CDDisplay.getModel().setValueAt(shichangtext.getText(), temp.result2, 6);

                            CDDisplaycopy.getModel().setValueAt(bianhaotext.getText(), temp.result2, 0);
                            CDDisplaycopy.getModel().setValueAt(biaotitext.getText(), temp.result2, 1);
                            CDDisplaycopy.getModel().setValueAt(zuozhetext.getText(), temp.result2, 2);
                            CDDisplaycopy.getModel().setValueAt(comboBox.getSelectedItem(), temp.result2, 3);
                            CDDisplaycopy.getModel().setValueAt(chupinzhetext.getText(), temp.result2, 4);
                            CDDisplaycopy.getModel().setValueAt(nianfentext.getText(), temp.result2, 5);
                            CDDisplaycopy.getModel().setValueAt(shichangtext.getText(), temp.result2, 6);
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

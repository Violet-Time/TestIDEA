package lesson_6;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String ... argc){
        JFrame frame = new JFrame("sdf");
        frame.setBounds(100,200,800,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(133, 57, 48));

        JLabel label= new JLabel("dfsdf");
        panel.add(label);

        JTextPane text = new JTextPane();
        panel.add(text);

        JButton button= new JButton("dfsdf");
        panel.add(button);

        JCheckBox checkBox = new JCheckBox("ksjdfk");
        panel.add(checkBox);

        JRadioButton radioButton_1 = new JRadioButton("1");
        JRadioButton radioButton_2 = new JRadioButton("2");
        JRadioButton radioButton_3 = new JRadioButton("3");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton_1);
        buttonGroup.add(radioButton_2);
        buttonGroup.add(radioButton_3);

        panel.add(radioButton_1);
        panel.add(radioButton_2);
        panel.add(radioButton_3);

        frame.add(panel);
        frame.setVisible(true);
    }
}

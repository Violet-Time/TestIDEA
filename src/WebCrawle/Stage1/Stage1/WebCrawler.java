package WebCrawle.Stage1.Stage1;

import javax.swing.*;

public class WebCrawler extends JFrame {
    public WebCrawler() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JTextArea text = new JTextArea();
        text.setName("TextArea");
        text.setBounds(10,10, getWidth() - 35, getHeight() - 55);

        add(text);
        setLayout(null);
        setVisible(true);
    }
}

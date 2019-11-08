package WebCrawle.Stage2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebCrawler extends JFrame {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public WebCrawler() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        //JPanel panel = new JPanel();

        JTextField inputURL = new JTextField("Set");
        inputURL.setBounds(10,10,500,30);

        JTextArea text = new JTextArea();
        text.setName("TextArea");
        text.setBounds(10,100, getWidth() - 35, getHeight() - 55);
        text.append("aaaaaaaaaaaaaaaaaaaaaaaaa");
        text.setEnabled(false);

        JButton inButton = new JButton();
        inButton.setBounds(520,10,60,30);
        inButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    text.setText(downloadingAWebPageText(inputURL.getText()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });




        add(inputURL);
        add(inButton);
        add(text);

        setLayout(null);
        setVisible(true);
    }
    public String downloadingAWebPageText(String url) throws IOException {

        final InputStream inputStream = new URL(url).openStream();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        final StringBuilder stringBuilder = new StringBuilder();

        String nextLine;
        while ((nextLine = reader.readLine()) != null) {
            stringBuilder.append(nextLine);
            stringBuilder.append(LINE_SEPARATOR);
        }

        return stringBuilder.toString();
    }
}

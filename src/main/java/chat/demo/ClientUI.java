package chat.demo;

import javax.swing.*;
import java.awt.*;

public class ClientUI extends JFrame {
    private TablePanel tablePanel;
    private InputPanel inputPanel;

    protected ClientUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat client");

        tablePanel = new TablePanel();
        inputPanel = new InputPanel();

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(tablePanel, BorderLayout.NORTH);
        contentPane.add(inputPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}

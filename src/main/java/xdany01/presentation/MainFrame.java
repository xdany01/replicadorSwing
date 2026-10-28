package xdany01.presentation;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public MainFrame() {
        init();
//        campoTexto.addActionListener(e -> {
//            replicadorLabel.setText(campoTexto.getText());
//        });


        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                replicadorLabel.setText(campoTexto.getText());
            }
        });
    }

    private void init() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
}

package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageWindow extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private boolean isServerWorking;

    JButton btnStart, btnStop;
    JPanel panelMenu, textArea;
    JTextArea log;
    Server server;

    MessageWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Messanger");
        setResizable(false);

        server = new Server();
        server.setVisible(false);

        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        log = new JTextArea();
        JScrollPane scroll = new JScrollPane(log);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking){
                    log.append("Server already started \n");
                } else{
                    isServerWorking = true;
                    log.append("Starting server \n");
                    server.setVisible(true);
                }

            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking){
                    isServerWorking = false;
                    log.append("Stop server \n");
                    server.setVisible(false);
                } else{
                    log.append("Server already stopped \n");
                }
            }
        });

        panelMenu = new JPanel(new GridLayout(1, 2));
        textArea = new JPanel(new GridLayout(1, 1));

        textArea.add(scroll);
        panelMenu.add(btnStart);
        panelMenu.add(btnStop);

        add(panelMenu, BorderLayout.SOUTH);
        add(textArea);

        setVisible(true);
    }
}

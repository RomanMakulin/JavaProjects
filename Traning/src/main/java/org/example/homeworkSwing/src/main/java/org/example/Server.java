package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Server extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private boolean isServerWorking;

    JButton btnStart, btnStop;
    JPanel panelMenu, textArea;
    JTextArea log;
    Client client;
    ArrayList<String> stringList = new ArrayList<>();
    Vars vars = new Vars();

    Server() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Messanger");
        setResizable(false);

        client = new Client();
        client.setVisible(false);

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
                    client.setVisible(true);
                        new FileWork().fileRead(stringList);
                        for (String s : stringList) {
                            client.messageArea.append(s + "\n");
                        }
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking){
                    isServerWorking = false;
                    log.append("Stop server \n");
                    client.setVisible(false);
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

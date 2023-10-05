package org.example.Server;

import org.example.Client.ClientGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    Server server = new Server();
    JButton btnStart, btnStop;
    JPanel panelMenu, textArea;
    JTextArea log;
    ClientGUI clientGUI = new ClientGUI();

    public ServerWindow() {

        settingsServerWindow();
        clientGUI.setVisible(false);

        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startServer();
            }
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopServer();
            }
        });

        textAreaAdd();
        panelBottomAdd();
        setVisible(true);
    }
    public void settingsServerWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Messanger");
        setResizable(false);
    }
    public void startServer(){
        if (server.isServerWorking()){
            log.append("Server already started \n");
        } else{
            server.start(clientGUI);
            log.append("Starting server \n");

        }
    }
    public void stopServer(){
        if (server.isServerWorking()){
            server.setServerWorking(false);
            log.append("Stop server \n");
            clientGUI.setVisible(false);
        } else{
            log.append("Server already stopped \n");
        }
    }
    public void textAreaAdd(){
        log = new JTextArea();
        JScrollPane scroll = new JScrollPane(log);
        textArea = new JPanel(new GridLayout(1, 1));
        textArea.add(scroll);
        add(textArea);
    }
    public void panelBottomAdd(){
        panelMenu = new JPanel(new GridLayout(1, 2));
        panelMenu.add(btnStart);
        panelMenu.add(btnStop);
        add(panelMenu, BorderLayout.SOUTH);
    }
}

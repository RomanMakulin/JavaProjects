package org.example.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


public class ClientGUI extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    JTextField inputIP;
    JTextField inputPort;
    JTextField inputName;
    public JTextField inputMessage;
    JPasswordField inputPassword;
    JButton btnLogin, btnSend;
    public JTextArea messageArea;
    JPanel panelTop = new JPanel(new GridLayout(2, 3));
    JPanel panelMessage = new JPanel(new GridLayout(1, 1));
    JPanel panelBottom = new JPanel(new GridLayout(1, 2));
    Client client = new Client();


    public ClientGUI(){

        settingsWindow();
        createFrames();
        panelTopAdd();
        messageAreaAdd();
        panelBottomAdd();

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        inputMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    sendMessage();
                }
            }
        });

        setVisible(true);
    }
    public void settingsWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Server client");
    }
    public void sendMessage(){
        client.sendMessage(inputMessage.getText());
        messageArea.append(client.line);
        inputMessage.setText(null);
    }
    public void login(){
        client.isLogin = true;
        panelTop.setVisible(false);
        messageArea.append(new Date() + ": Complete login! \n");
    }
    public void createFrames(){
        inputIP = new JTextField(client.vars.getIP());
        inputPort = new JTextField(client.vars.getPORT());
        inputName = new JTextField(client.vars.getNAME());
        inputMessage = new JTextField();
        inputPassword = new JPasswordField(client.vars.getPASSWORD());

        btnLogin = new JButton("Login");
        btnSend = new JButton("Send");
    }
    public void panelTopAdd(){
        panelTop.add(inputIP);
        panelTop.add(inputPort);
        panelTop.add(inputName);
        panelTop.add(inputPassword);
        panelTop.add(btnLogin);

        add(panelTop, BorderLayout.NORTH);
    }
    public void messageAreaAdd(){
        messageArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(messageArea);
        panelMessage.add(scroll);
        add(panelMessage);
    }
    public void panelBottomAdd(){
        panelBottom.add(inputMessage);
        panelBottom.add(btnSend);
        add(panelBottom, BorderLayout.SOUTH);
    }
}

package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;


public class Server extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private boolean isLogin = false;

    JTextField inputIP, inputPort, inputName, inputMessage;
    JPasswordField inputPassword;
    JButton btnLogin, btnSend;
    JTextArea messageArea;
    JPanel panelTop = new JPanel(new GridLayout(2, 3));
    JPanel panelMessage = new JPanel(new GridLayout(1, 1));
    JPanel panelBottom = new JPanel(new GridLayout(1, 2));
    Vars vars = new Vars();

    Server(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Server client");

        inputIP = new JTextField(vars.getIP());
        inputPort = new JTextField(vars.getPORT());
        inputName = new JTextField(vars.getNAME());
        inputMessage = new JTextField();
        inputPassword = new JPasswordField(vars.getPASSWORD());

        btnLogin = new JButton("Login");
        btnSend = new JButton("Send");

        panelTop.add(inputIP);
        panelTop.add(inputPort);
        panelTop.add(inputName);
        panelTop.add(inputPassword);
        panelTop.add(btnLogin);

        add(panelTop, BorderLayout.NORTH);

        messageArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(messageArea);
        panelMessage.add(scroll);
        add(panelMessage);

        panelBottom.add(inputMessage);
        panelBottom.add(btnSend);
        add(panelBottom, BorderLayout.SOUTH);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLogin = true;
                panelTop.setVisible(false);
                messageArea.append(new Date() + ": Complete login! \n");
            }
        });

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLogin){
                    messageArea.append(vars.getNAME() + ": " + inputMessage.getText() + "\n");
                    inputMessage.setText(null);
                } else{
                    messageArea.append("Не залогинились \n");
                }

            }
        });

        setVisible(true);
    }
}

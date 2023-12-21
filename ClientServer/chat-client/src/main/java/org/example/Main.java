package org.example;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Введите свое имя:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            Socket socket = new Socket("localhost", 1400);
            Client client = new Client(socket, name);
            InetAddress inetAddress = socket.getInetAddress();
            String remoteIp = inetAddress.getHostAddress();

            System.out.println("Inet address: " + inetAddress);
            System.out.println("Remote IP: " + remoteIp);
            System.out.println("Local port: " + socket.getLocalPort());

            client.listenForMessage();
            client.writeMessage();


        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
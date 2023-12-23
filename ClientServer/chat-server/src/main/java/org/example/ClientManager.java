package org.example;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientManager implements Runnable {
    private final Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String name;
    public final static ArrayList<ClientManager> clients = new ArrayList<>();

    public ClientManager(Socket socket) {
        this.socket = socket;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.name = bufferedReader.readLine();
            clients.add(this);
            System.out.println(name + " подключился к чату.");
            broadcastMessage(name + " подключился к чату! [SERVER]");
        } catch (IOException e) {
            closeAll(socket, bufferedWriter, bufferedReader);
        }

    }

    @Override
    public void run() {
        String messageFromClient;

        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();
                broadcastMessage(messageFromClient);
            } catch (IOException e) {
                closeAll(socket, bufferedWriter, bufferedReader);
                break;
            }
        }
    }

    private void broadcastMessage(String message) {

        // @Roman sdasdad

        List<String> arrMes = new ArrayList<>(List.of(message.split(" ")));

        if (arrMes.get(1).charAt(0) == '@') {
            StringBuilder stringBuilder = new StringBuilder();
            String needName = arrMes.get(1).substring(1);
            arrMes.remove(1);
            for (String arrMe : arrMes) stringBuilder.append(arrMe).append(" ");
            clients.forEach(item -> {
                WriteIsEquals(item, Objects.equals(item.name, needName), stringBuilder.toString());
            });
        } else clients.forEach(item -> {
            WriteIsEquals(item, !item.name.equals(name), message);
        });
    }

    public void WriteIsEquals(ClientManager item, boolean isEquals, String message) {
        try {
            if (isEquals) {
                item.bufferedWriter.write(message);
                item.bufferedWriter.newLine();
                item.bufferedWriter.flush();
            }
        } catch (IOException e) {
            closeAll(socket, bufferedWriter, bufferedReader);
        }
    }

    public void closeAll(Socket socket, BufferedWriter bufferedWriter, BufferedReader bufferedReader) {
        removeClient();
        try {
            if (socket != null) socket.close();
            if (bufferedReader != null) bufferedReader.close();
            if (bufferedWriter != null) bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeClient() {
        clients.remove(this);
        System.out.println(name + " покинул(а) чат.");
    }
}

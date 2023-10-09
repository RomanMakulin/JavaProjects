package org.example.Server;

import org.example.Client.ClientGUI;

import java.util.ArrayList;

public class Server{
    private boolean isServerWorking;
    ArrayList<String> stringList = new ArrayList<>();

    public boolean isServerWorking() {
        return isServerWorking;
    }

    public void setServerWorking(boolean serverWorking) {
        isServerWorking = serverWorking;
    }
    public void start(ClientGUI clientGUI) {
        isServerWorking = true;
        new FileWork().fileRead(stringList);
        for (String s : stringList) {
            clientGUI.messageArea.append(s + "\n");
        }
        clientGUI.setVisible(true);
    }
}

package org.example;

import org.example.Client.ClientGUI;

import java.io.FileWriter;
import java.io.IOException;

public class SendMessage {
    public void send (ClientGUI clientGUI, Vars vars){
            String line = vars.getNAME() + ": " + clientGUI.inputMessage.getText() + "\n";
            clientGUI.messageArea.append(line);
            clientGUI.inputMessage.setText(null);

            try (FileWriter fr = new FileWriter("logs.txt", true)) {
                fr.write(line);
                fr.flush();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
    }
}

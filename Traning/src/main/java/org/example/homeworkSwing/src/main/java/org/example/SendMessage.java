package org.example;

import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;

public class SendMessage {
    public void send (Client client, Vars vars){
            String line = vars.getNAME() + ": " + client.inputMessage.getText() + "\n";
            client.messageArea.append(line);
            client.inputMessage.setText(null);

            try (FileWriter fr = new FileWriter("logs.txt", true)) {
                fr.write(line);
                fr.flush();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
    }
}

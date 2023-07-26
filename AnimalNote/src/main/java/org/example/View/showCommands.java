package org.example.View;

import org.example.Model.Interfaces.Menu;

public class showCommands {
    public void commandList(String[] commands){
        for (int i = 0; i < commands.length; i++) {
            System.out.println(commands[i]);
        }
    }
}

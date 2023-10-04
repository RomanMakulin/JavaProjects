package org.example.Client;

import org.example.FileWork;
import org.example.Vars;

public class Client implements ClientView {
    Vars vars;
    String line;
    boolean isLogin;

    public Client() {
        this.vars = new Vars();
        this.isLogin = false;
    }

    @Override
    public void sendMessage(String inputText) {
        if (isLogin){
            line = vars.getNAME() + ": " + inputText + "\n";
            new FileWork().sendLog(line);
        }

    }

}
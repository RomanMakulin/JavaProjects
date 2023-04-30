package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.SimpleSystemOut;

public class SystemExit implements SimpleSystemOut {
    @Override
    public void show(){
        System.out.println("Cia");
        System.exit(1);
    }
}

package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.SimpleSystemOut;

public class ErrorPassword implements SimpleSystemOut {
    @Override
    public void show(){
        System.out.println("Error password!");
        System.exit(1);
    }
}

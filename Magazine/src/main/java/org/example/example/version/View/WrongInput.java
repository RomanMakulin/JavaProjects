package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.SimpleSystemOut;

public class WrongInput implements SimpleSystemOut {
    @Override
    public void show(){
        System.out.println("Wrong input!");
    }
}

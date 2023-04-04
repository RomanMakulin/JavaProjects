package org.example.View.Print;

import org.example.Model.Interfaces.SimplePrint;

public class WrongInput implements SimplePrint {
    @Override
    public void print() {
        System.out.println("Wrong login/pin. System close.");
    }
}

package org.example.example.View.SimpleView;

import org.example.example.Model.Interfaces.Print;

public class WrongInput implements Print {
    @Override
    public void print() {
        System.out.println("Wrong input!");
    }
}

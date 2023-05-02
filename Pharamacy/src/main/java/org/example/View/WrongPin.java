package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class WrongPin implements ViewService {
    @Override
    public void show() {
        System.out.println("Wrong pin!");
    }
}

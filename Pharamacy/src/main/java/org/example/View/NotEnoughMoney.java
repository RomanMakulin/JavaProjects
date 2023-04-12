package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class NotEnoughMoney implements ViewService {
    @Override
    public void show() {
        System.out.println("Error. Not enough money!");
    }
}

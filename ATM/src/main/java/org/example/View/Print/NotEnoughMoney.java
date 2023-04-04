package org.example.View.Print;

import org.example.Model.Interfaces.SimplePrint;

public class NotEnoughMoney implements SimplePrint {
    @Override
    public void print() {
        System.out.println("Недостаточно средств!");
    }
}

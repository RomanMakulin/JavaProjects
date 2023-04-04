package org.example.View.Print;

import org.example.Model.Interfaces.SimplePrint;

public class NotWorkingAtm implements SimplePrint {
    @Override
    public void print() {
        System.out.println("Банкомат не работает, выберите другой!");
    }
}

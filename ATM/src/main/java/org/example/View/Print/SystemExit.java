package org.example.View.Print;

import org.example.Model.Interfaces.SimplePrint;

public class SystemExit implements SimplePrint {
    @Override
    public void print() {
        System.out.println("Goodbye and get luck! See you later.");
    }
}

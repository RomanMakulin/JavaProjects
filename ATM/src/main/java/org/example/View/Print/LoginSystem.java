package org.example.View.Print;

import org.example.Model.Interfaces.SimplePrint;

public class LoginSystem implements SimplePrint {
    @Override
    public void print() {
        System.out.println("\nВход в систему и идентефикация пользователя.");
    }
}

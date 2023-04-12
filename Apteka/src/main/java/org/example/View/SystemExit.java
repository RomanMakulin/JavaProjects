package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class SystemExit implements ViewService {
    @Override
    public void show() {
        System.out.println("Пока-пока!");
        System.exit(1);
    }
}

package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class WrongCmd implements ViewService {
    public void show(){
        System.out.println("Нет такой команды");
    }
}

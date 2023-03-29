package org.example.example.Controller.CreateAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Athletes.Bot;
import org.example.example.View.InputInt;
import org.example.example.View.InputStr;

import java.util.List;

public class BotAdd implements Create{
    @Override
    public void add(List<Athletes> athletes) {
        athletes.add(new Bot(new InputStr().input("Name: "), new InputInt().input("Max run dist: "),
                new InputInt().input("Max jump: ")));
    }
}

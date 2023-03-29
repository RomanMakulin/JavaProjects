package org.example.example.Controller.CreateAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Athletes.Cat;
import org.example.example.View.InputInt;
import org.example.example.View.InputStr;

import java.util.List;

public class CatAdd implements Create{
    @Override
    public void add(List<Athletes> athletes) {
        athletes.add(new Cat(new InputStr().input("Name: "), new InputInt().input("Max run dist: "),
                new InputInt().input("Max jump: ")));
    }
}

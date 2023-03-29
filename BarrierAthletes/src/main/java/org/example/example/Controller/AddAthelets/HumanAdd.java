package org.example.example.Controller.AddAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.View.Input.InputInt;
import org.example.example.View.Input.InputStr;
import org.example.example.Model.Athletes.Human;
import org.example.example.Model.Interfaces.Add;
import java.util.List;

public class HumanAdd implements Add{

    @Override
    public List<Athletes> add() {
        athletes.add(new Human(new InputStr().input("Name: "), new InputInt().input("Max run dist: "),
                new InputInt().input("Max jump: ")));
        return athletes;
    }
}

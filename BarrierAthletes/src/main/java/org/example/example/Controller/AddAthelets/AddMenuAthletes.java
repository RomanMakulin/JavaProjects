package org.example.example.Controller.AddAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.View.Menu.CreateAtheletsMenu;
import org.example.example.View.Input.InputInt;
import org.example.example.Model.Interfaces.Add;
import java.util.List;

public class AddMenuAthletes implements Add{
    @Override
    public List<Athletes> add() {
        int size = new InputInt().input("Задайте количество атлетов соревнования: ");
        for (int i = 0; i < size; i++) {
            switch (new CreateAtheletsMenu().input()) {
                case "1":
                    new HumanAdd().add();
                    break;
                case "2":
                    new CatAdd().add();
                    break;
                case "3":
                    new BotAdd().add();
                    break;
                default:
                    System.out.println("Wrong input!");
                    size++;
                    break;
            }
        }
        return athletes;
    }
}

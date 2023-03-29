package org.example.example.Controller.CreateAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.View.CreateAtheletsMenu;
import org.example.example.View.InputInt;

import java.util.List;

public class AtheletsAdd implements Create {
    @Override
    public void add(List<Athletes> athletes) {
        int size = new InputInt().input("Задайте количество атлетов соревнования: ");
        for (int i = 0; i < size; i++) {
            switch (new CreateAtheletsMenu().input()) {
                case "1":
                    new HumanAdd().add(athletes);
                    break;
                case "2":
                    new CatAdd().add(athletes);
                    break;
                case "3":
                    new BotAdd().add(athletes);
                    break;
                default:
                    System.out.println("Wrong input!");
                    size++;
                    break;
            }
        }
    }
}

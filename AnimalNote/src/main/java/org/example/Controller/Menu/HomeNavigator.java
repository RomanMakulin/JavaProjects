package org.example.Controller.Menu;

import org.example.Controller.Menu.Case.TypeMenuCase;
import org.example.Controller.sql.newAnimal;
import org.example.Model.Cat;
import org.example.Model.Dog;
import org.example.Model.Hamster;
import org.example.Model.Interfaces.Menu;
import org.example.View.ViewMenu.HomeMenu;
import org.example.View.inputCommandAnimal;
import org.example.View.inputDateBith;
import org.example.View.inputMenuCommand;
import org.example.View.inputNameAnimal;

public class HomeNavigator implements Menu {
    @Override
    public void menu() {
        new HomeMenu().menu();
        switch (new inputMenuCommand().input()){
            case "1":
                new newAnimal().create(new Cat(new inputNameAnimal().input(), new inputCommandAnimal().input()));
                break;
            case "2":
                new newAnimal().create(new Dog(new inputNameAnimal().input(), new inputCommandAnimal().input()));
                break;
            case "3":
                new newAnimal().create(new Hamster(new inputNameAnimal().input(), new inputCommandAnimal().input()));
                break;
            case "4":
                new TypeMenuCase().menu();
                break;
        }
    }
}

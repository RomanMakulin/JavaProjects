package org.example.Controller.Menu;

import org.example.Controller.Menu.Case.TypeMenuCase;
import org.example.Controller.sql.newAnimal;
import org.example.Model.Camel;
import org.example.Model.Donkey;
import org.example.Model.Horse;
import org.example.Model.Interfaces.Menu;
import org.example.View.ViewMenu.PackMenu;
import org.example.View.inputCommandAnimal;
import org.example.View.inputDateBith;
import org.example.View.inputMenuCommand;
import org.example.View.inputNameAnimal;

public class PackNavigator implements Menu {
    public void menu() {
        new PackMenu().menu();
        switch (new inputMenuCommand().input()) {
            case "1":
                new newAnimal().create(new Horse(new inputNameAnimal().input(), new inputCommandAnimal().input(), new inputDateBith().input()));
                break;
            case "2":
                new newAnimal().create(new Camel(new inputNameAnimal().input(), new inputCommandAnimal().input(), new inputDateBith().input()));
                break;
            case "3":
                new newAnimal().create(new Donkey(new inputNameAnimal().input(), new inputCommandAnimal().input(), new inputDateBith().input()));
                break;
            case "4":
                new TypeMenuCase().menu();
                break;
        }
    }
}

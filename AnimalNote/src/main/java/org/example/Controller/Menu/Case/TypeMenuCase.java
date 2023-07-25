package org.example.Controller.Menu.Case;

import org.example.Controller.Controller;
import org.example.Controller.Menu.HomeNavigator;
import org.example.Controller.Menu.PackNavigator;
import org.example.Model.Interfaces.Menu;
import org.example.View.ViewMenu.TypeMenu;
import org.example.View.inputMenuCommand;

public class TypeMenuCase implements Menu {

    @Override
    public void menu() {
        boolean menu2 = true;
        while (true) {
            new TypeMenu().menu();
            switch (new inputMenuCommand().input()) {
                case "1":
                    new HomeNavigator().menu();
                    break;

                case "2":
                    new PackNavigator().menu();
                    break;

                case "3":
                    new Controller().buttonClick();
                    break;
            }
        }
    }
}

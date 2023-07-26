package org.example.Controller;

import org.example.Controller.Menu.Case.TypeMenuCase;
import org.example.Controller.sql.getCommand;
import org.example.Controller.sql.getInfoAnimal;
import org.example.Controller.sql.updateAnimalCommand;
import org.example.Controller.sql.updateAnimalType;
import org.example.Model.DB.DataBaseHandler;
import org.example.View.*;
import org.example.View.ViewMenu.MainMenu;

import java.util.Scanner;


public class Controller extends DataBaseHandler {
    public void buttonClick(){

        boolean menu = true;
        while (menu == true){

            new MainMenu().menu();
            switch (new inputMenuCommand().input()){
                case "0":
                    new getInfoAnimal().info(new inputId().input());
                    break;

                case "1":
                    new TypeMenuCase().menu();
                    break;

                case "2":
                    new updateAnimalType().update(new inputId().input(), new inputType().input());
                    break;

                case "3":
                    new getCommand().get(new inputId().input());
                    break;

                case "4":
                    new updateAnimalCommand().update(new inputId().input());
                    break;

                case "5":
                    menu = false;
                    break;

            }

        }




    }
}

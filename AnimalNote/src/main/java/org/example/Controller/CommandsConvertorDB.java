package org.example.Controller;

import org.example.Model.Animal;

public class CommandsConvertorDB {
    public String convertString(Animal animal){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < animal.getCommandsList().size(); i++) {
            str.append(animal.getCommandsList().get(i) + " ");
        }
        String commands = str.toString();
        return commands;
    }
}

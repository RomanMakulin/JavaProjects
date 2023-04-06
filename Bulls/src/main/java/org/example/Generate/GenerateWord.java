package org.example.Generate;

import org.example.Generate.GenerateMenu;
import org.example.View.WorldSizeInput;

import java.util.List;
import java.util.Random;

public class GenerateWord {
    public String word(){

        List<String> charList = new GenerateMenu().generate();
        int randomIndex = 0;

        int size = new WorldSizeInput().print();
        String newWord = "";

        for (int i = 0; i < size; i++) {
            randomIndex = new Random().nextInt(charList.size());
            newWord += charList.get(randomIndex);
        }

        return newWord;
    }
}

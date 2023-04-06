package org.example.Controller.Generate;

import org.example.View.WorldSizeInput;
import java.util.List;
import java.util.Random;

public class GenerateWord {
    public String word(){

        List<String> charList = new GenerateMenu().generate();

        int size = new WorldSizeInput().print();
        String newWord = "";
        int randomIndex = 0;

        for (int i = 0; i < size; i++) {
            randomIndex = new Random().nextInt(charList.size());
            newWord += charList.get(randomIndex);
        }

        return newWord;
    }
}

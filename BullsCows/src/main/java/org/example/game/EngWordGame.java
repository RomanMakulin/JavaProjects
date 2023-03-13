package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class EngWordGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'a'; i < 'c'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}

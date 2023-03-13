package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class RuWordGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'а'; i < 'в'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}

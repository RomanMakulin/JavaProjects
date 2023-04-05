package org.example.example.verison1.GameMode;

import java.util.ArrayList;
import java.util.List;

public class EngGame implements GenerateChar {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'a'; i < 'c'; i++) charList.add(String.valueOf(i));
        return charList;
    }
}

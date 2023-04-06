package org.example.example.verison1.GameMode;

import org.example.example.verison1.GameMode.GenerateChar;

import java.util.ArrayList;
import java.util.List;

public class RuGame implements GenerateChar {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'а'; i < 'е'; i++) charList.add(String.valueOf(i));
        return charList;
    }
}

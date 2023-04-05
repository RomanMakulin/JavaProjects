package org.example.example.verison1.GameMode;

import org.example.example.verison1.GameMode.GenerateChar;

import java.util.ArrayList;
import java.util.List;

public class NumberGame implements GenerateChar {
    @Override
    public List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) charList.add(String.valueOf(i));
        return charList;
    }
}

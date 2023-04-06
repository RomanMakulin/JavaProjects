package org.example.Controller.Generate.GameMode;

import org.example.Model.Interfaces.CharListGenerate;
import java.util.ArrayList;
import java.util.List;

public class NumGame implements CharListGenerate {
    @Override
    public List<String> generate() {
        List<String> charList = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}

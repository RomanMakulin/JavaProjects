package org.example.Controller.Generate.GameMode;

import org.example.Model.Interfaces.CharListGenerate;
import java.util.ArrayList;
import java.util.List;

public class RuGame implements CharListGenerate {
    @Override
    public List<String> generate() {
        List<String> charList = new ArrayList<>();
        for (char i = 'а'; i < 'я'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}

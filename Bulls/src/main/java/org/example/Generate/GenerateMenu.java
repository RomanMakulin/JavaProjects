package org.example.Generate;

import org.example.Generate.GameMode.CharListGenerate;
import org.example.Generate.GameMode.RuGame;
import org.example.View.InputCmdMenu;

import java.util.List;

public class GenerateMenu implements CharListGenerate {
    @Override
    public List<String> generate() {

        switch(new InputCmdMenu().print()){
            case 1:
                return new RuGame().generate();


        }
        return null;
    }
}

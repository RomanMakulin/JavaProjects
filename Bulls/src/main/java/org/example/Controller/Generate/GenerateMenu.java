package org.example.Controller.Generate;

import org.example.Model.Interfaces.CharListGenerate;
import org.example.Controller.Generate.GameMode.EngGame;
import org.example.Controller.Generate.GameMode.NumGame;
import org.example.Controller.Generate.GameMode.RuGame;
import org.example.View.InputCmdMenu;
import java.util.List;

public class GenerateMenu implements CharListGenerate {
    @Override
    public List<String> generate() {

        switch(new InputCmdMenu().print()){
            case 1:
                return new RuGame().generate();
            case 2:
                return new EngGame().generate();
            case 3:
                return new NumGame().generate();
        }
        return null;
    }
}

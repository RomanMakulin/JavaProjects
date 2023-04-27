package org.example.Controller.Actions;

import org.example.Model.Interfaces.Actions;
import org.example.Model.Toy;
import org.example.View.Input.InputID;
import org.example.View.Input.InputWidth;

import java.util.List;

public class SetWidth implements Actions {
    @Override
    public void service(List<Toy> toyList){
        int needId = new InputID().input();
        for (int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getId() == needId) toyList.get(i).setWidth(new InputWidth().input());
        }
    }
}

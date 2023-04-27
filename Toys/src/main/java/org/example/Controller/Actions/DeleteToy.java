package org.example.Controller.Actions;

import org.example.Model.Interfaces.Actions;
import org.example.Model.Toy;
import org.example.View.Input.InputID;
import java.util.List;

public class DeleteToy implements Actions {
    @Override
    public void service(List<Toy> toyList) {
        int needId = new InputID().input();
        for (int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getId() == needId) toyList.remove(i);
        }
    }
}

package org.example.Controller.Actions;
import org.example.Model.Interfaces.Actions;
import org.example.Model.Toy;
import org.example.View.Input.InputName;
import org.example.View.Input.InputWidth;

import java.util.List;

public class AddToy implements Actions {
    @Override
    public void service(List<Toy> toyList) {
        toyList.add(new Toy(new InputName().input(), new InputWidth().input()));
    }
}

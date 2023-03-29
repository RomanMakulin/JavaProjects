package org.example.example.Controller.AddBarriers;

import org.example.example.Model.Interfaces.Add;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Barrier.Runroad;
import org.example.example.View.Input.InputInt;
import java.util.List;

public class AddRunroad implements Add {
    @Override
    public List<Barriers> add() {
        barriers.add(new Runroad(new InputInt().input("Road: ")));
        return barriers;
    }
}

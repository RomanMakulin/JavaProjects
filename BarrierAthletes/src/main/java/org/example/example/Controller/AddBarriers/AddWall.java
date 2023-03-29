package org.example.example.Controller.AddBarriers;

import org.example.example.Model.Interfaces.Add;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.View.Input.InputInt;
import org.example.example.Model.Barrier.Wall;
import java.util.List;

public class AddWall implements Add {
    @Override
    public List<Barriers> add() {
        barriers.add(new Wall(new InputInt().input("Hight: ")));
        return barriers;
    }
}

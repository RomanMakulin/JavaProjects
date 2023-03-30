package org.example.example.Controller.AddBarriers;

import org.example.example.Model.Interfaces.Add;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.View.Menu.CreateBarriersMenu;
import org.example.example.View.Input.InputInt;
import java.util.List;

public class AddMenuBarriers implements Add {
    @Override
    public List<Barriers> add() {
        int size = new InputInt().input("Задайте количество барьеров: ");
        for (int i = 0; i < size; i++) {
            switch (new CreateBarriersMenu().input()) {
                case "1":
                    new AddWall().add();
                    break;
                case "2":
                    new AddRunroad().add();
                    break;
                default:
                    System.out.println("Wrong input!");
                    size++;
                    break;
            }
        }
        return barriers;
    }
}

package org.example.example.Controller.AddBarriers;

import org.example.example.Model.Interfaces.Add;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.View.Menu.CreateBarriersMenu;
import org.example.example.View.Input.InputInt;
import org.example.example.View.SimpleView.WrongInput;

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
                    new WrongInput().print();
                    size++;
                    break;
            }
        }
        return barriers;
    }
}

package org.example.Controller.Actions;

import org.example.Controller.CheckWinner.Logic;
import org.example.Model.Toy;
import org.example.View.ListNull;

import java.util.List;

public class CheckWinner {
    public void check (List<Toy> toyList, List<Toy> myItems){
        if (!toyList.isEmpty()) new Logic().main(toyList, myItems);
        else {
            new ListNull().print();
            System.exit(1);
        }
    }
}

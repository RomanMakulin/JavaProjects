package org.example.Controller;

import org.example.Controller.CheckWinner.Logic;
import org.example.Controller.FilesWork.ReadFile;
import org.example.Model.Toy;
import org.example.View.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

        List<Toy> toyList = new ReadFile().read("toys.csv");
        List<Toy> myItems = new ArrayList<>();

        while (true) {
            switch (new InputMenu().input()) {
                case "1":
                    new ViewToyList().view(toyList);
                    break;
                case "2":
                    toyList.add(new Toy(new InputName().input(), new InputWidth().input()));
                    break;
                case "3":
                    toyList.get(new InputID().input()).setWidth(new InputWidth().input());
                    break;
                case "4":
                    if (!toyList.isEmpty()) new Logic().checkWinner(toyList, myItems);
                    else {
                        new ListNull().print();
                        System.exit(1);
                    }
                    break;
                case "5":
                    new ViewMyList().view(myItems);
                    break;
            }
        }

    }
}

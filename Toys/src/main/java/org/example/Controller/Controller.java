package org.example.Controller;

import org.example.Controller.Actions.DeleteToy;
import org.example.Controller.Actions.SetWidth;
import org.example.Controller.Actions.CheckWinner;
import org.example.Controller.FilesWork.Config.PathRead;
import org.example.Controller.FilesWork.ReadFile;
import org.example.Controller.FilesWork.WriterFile;
import org.example.Model.Toy;
import org.example.View.*;
import org.example.View.Input.InputName;
import org.example.View.Input.InputWidth;
import org.example.View.Menu.InputMenu;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

        List<Toy> toyList = new ReadFile().read(new PathRead().cfg());
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
                    new SetWidth().service(toyList);
                    break;
                case "4":
                    new DeleteToy().service(toyList);
                    break;
                case "5":
                    new CheckWinner().check(toyList, myItems);
                    new SystemExit().print();
                    break;
            }
            new WriterFile().file(toyList, new PathRead().cfg()); // обновляем данные в исходнике
        }


    }
}

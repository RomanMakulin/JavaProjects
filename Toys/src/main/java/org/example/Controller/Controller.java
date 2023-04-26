package org.example.Controller;

import org.example.Model.Toy;
import org.example.Model.ToyList;
import org.example.View.InputID;
import org.example.View.InputWidth;
import org.example.View.ViewPrises;
import org.example.View.ViewToyList;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick(){

        // добавление списка игрушек к розыгрышу
        List<Toy> toyList = new ToyList().list();

        // функционал изменения редкости
        toyList.get(new InputID().print()).setWidth(new InputWidth().print());

        // просмотр списка игрушек
        new ViewToyList().view(toyList);

        // логика выбора победителя
        new TargetWinner().checkWinner(toyList);
    }

}

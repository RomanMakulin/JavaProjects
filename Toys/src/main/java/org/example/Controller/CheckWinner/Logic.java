package org.example.Controller.CheckWinner;

import org.example.Controller.FilesWork.WriterFile;
import org.example.Model.Toy;
import org.example.View.Win;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    public void checkWinner(List<Toy> toyList, List<Toy> myList){

        List<Toy> low = new ArrayList<>(); // группа призов (редкость меньше 30 %)
        List<Toy> high= new ArrayList<>(); // группа призов (редкость выше 30 %)

        new Distribution().service(toyList, low, high, myList); // распределение по классам редкости

        new Win().classic(high);
        new Win().rare(low);

        new WriterFile().file(myList);

    }
}

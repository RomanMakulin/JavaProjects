package org.example.Model;

import org.example.Model.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToyList {
    public List<Toy> list (){
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("конструктор", 20));
        toyList.add(new Toy("автомат", 20));
        toyList.add(new Toy("ствол", 30));
        toyList.add(new Toy("матрешка", 50));
        toyList.add(new Toy("мяч", 350));
        return toyList;
    }
}

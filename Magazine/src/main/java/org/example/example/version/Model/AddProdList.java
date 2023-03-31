package org.example.example.version.Model;

import org.example.example.version.VIew.InputInt;
import org.example.example.version.VIew.InputStr;
import java.util.ArrayList;
import java.util.List;


public class AddProdList {
    public List<Product> add() {
        List<Product> allProds = new ArrayList<>();
        int count = new InputInt().input("Введите кол-во товаров для добавления");
        for (int j = 0; j < count; j++) {
            allProds.add(new Product(new InputStr().input("Название: "), new InputInt().input("Цена: ")));
        }
        return allProds;
    }
}

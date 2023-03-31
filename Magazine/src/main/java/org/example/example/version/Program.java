package org.example.example.version;

import org.example.example.version.Model.Basket;
import org.example.example.version.Model.Product;
import org.example.example.version.Model.AddProdList;
import org.example.example.version.Model.Category;
import org.example.example.version.VIew.InputInt;
import org.example.example.version.VIew.InputStr;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(new InputStr().input("Введите название категории: "), new AddProdList().add()));
        categoryList.add(new Category(new InputStr().input("Введите название категории: "), new AddProdList().add()));

        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println(categoryList.get(i));
        }

        List<Product> buyList = new ArrayList<>();

        switch (new InputStr().input("Выберите категорию для добавления товара в корзину:\n" +
                "1 - Basketball\n2 - Football\n3 - Hockey")){
            case "1":
                for (int i = 0; i < categoryList.size(); i++) {
                    if (categoryList.get(i).getCatName().equals("Basketball"))
                        buyList.add(categoryList.get(i).get(new InputInt().input("Введите айди: ")));
                }
        }

        System.out.println(buyList);




    }
}

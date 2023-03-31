package org.example.example.version.Controller;

import org.example.example.version.Controller.ProductsList.BasketbalList;
import org.example.example.version.Controller.ProductsList.FootballList;
import org.example.example.version.Controller.ProductsList.HockeyList;
import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.Products.Product;
import org.example.example.version.Model.User.User;
import org.example.example.version.VIew.InputStr;
import org.example.example.version.VIew.MenuInput;
import org.example.example.version.VIew.Show;
import org.example.example.version.VIew.Wrong;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void start() {
        List<Product> basketball = new BasketbalList().add();
        List<Product> football = new FootballList().add();
        List<Product> hockey = new HockeyList().add();

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Basketball", basketball));
        categoryList.add(new Category("Football", football));
        categoryList.add(new Category("Hockey", hockey));

        new Show().print(categoryList);

//        User user = new User("Roman", "123");

        User user = new User("1", "1");

        switch (new InputStr().input("1 - регистрация\n2 - вход")){
            case "1":
                String login = new InputStr().input("Придумайте логин: ");
                String password = new InputStr().input("Придумайте пароль: ");
                if (password.equals(new InputStr().input("Повторите пароль: "))){
                    user = new User(login, password);
                }
                break;
            case "2":
                new Menu().showMenu(user, basketball, football, hockey, categoryList);
                new Show().print(categoryList);
                break;
        }

    }

}

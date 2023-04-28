package org.example.example.version.Controller;

import org.example.example.version.Controller.ProductsList.BasketbalList;
import org.example.example.version.Controller.ProductsList.FileWork.FileWork;
import org.example.example.version.Controller.ProductsList.FootballList;
import org.example.example.version.Controller.ProductsList.HockeyList;
import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public void start() {

        List<Category> categoryList = Arrays.asList(
                new Category("Basketball", new FileWork().readFile("basketball.csv")),
                new Category("Football", new FileWork().readFile("football.csv")),
                new Category("Hockey", new FileWork().readFile("hockey.csv")));

        User user = new Registration().newUser();
        new Menu().showMenu(user, categoryList);

    }

}

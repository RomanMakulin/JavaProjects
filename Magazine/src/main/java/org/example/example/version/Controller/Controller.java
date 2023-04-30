package org.example.example.version.Controller;

import org.example.example.version.Controller.ProductsList.FileWork.ReadFile;
import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public void start() {

        List<Category> categoryList = Arrays.asList(
                new Category("basketball", new ReadFile().readFile("basketball.csv")),
                new Category("football", new ReadFile().readFile("football.csv")),
                new Category("hockey", new ReadFile().readFile("hockey.csv")));

        User user = new Registration().newUser();

        new Login().login(user, categoryList);

    }

}

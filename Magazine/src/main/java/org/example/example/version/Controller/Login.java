package org.example.example.version.Controller;

import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;
import org.example.example.version.View.InputStr;
import org.example.example.version.View.MaxTryLogin;
import org.example.example.version.View.ViewLogin;

import java.util.List;

public class Login {
    public void login(User user, List<Category> categoryList) {

        int count = 0;
        int maxTry = 5;
        new ViewLogin().print();

        while (count < maxTry) {
            if (user.getName().equals(new InputStr().input("Login: "))
                    && user.getPassword().equals(new InputStr().input("Введите пароль: "))) {

                new Menu().showMenu(user, categoryList);

            }else new MaxTryLogin().error(maxTry);

        }
    }
}

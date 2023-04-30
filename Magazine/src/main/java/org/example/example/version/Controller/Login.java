package org.example.example.version.Controller;

import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;
import org.example.example.version.View.*;

import java.util.List;

public class Login {
    public void login(User user, List<Category> categoryList) {

        int count = 0;
        int maxTry = 5;
        new ViewLogin().show();

        while (count < maxTry) {
            if (user.getName().equals(new LoginInput().input())
                    && user.getPassword().equals(new PasswordInput().input())) {
                new Menu().showMenu(user, categoryList);
            }else new MaxTryLogin().error(maxTry);
        }
    }
}

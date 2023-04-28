package org.example.example.version.Controller;

import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;
import org.example.example.version.View.*;

import java.util.List;

public class Menu {
    public void showMenu(User user, List<Category> categoryList) {

        while (true) {
            switch (new MenuInput().input()) {
                case "1":
                    new ActionBuy().buy(user, categoryList, "Basketball");
                    break;
                case "2":
                    new ActionBuy().buy(user, categoryList, "Football");
                    break;
                case "3":
                    new ActionBuy().buy(user, categoryList, "Hockey");
                    break;
                case "4":
                    user.show();
                    break;
                case "5":
                    new SystemExit().cya();
                case "6":
                    new Show().print(categoryList);
                    break;
                default:
                    new WrongInput().error();
                    break;
            }

        }
    }
}

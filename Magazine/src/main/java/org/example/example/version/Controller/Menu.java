package org.example.example.version.Controller;

import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.Products.Product;
import org.example.example.version.Model.User.User;
import org.example.example.version.VIew.MenuInput;
import org.example.example.version.VIew.Show;

import java.util.List;

public class Menu {
    public void showMenu(User user, List<Product> basketball, List<Product> football, List<Product> hockey, List<Category> categoryList){
        int count = 0;
        int maxTry = 5;
        System.out.println("Вход в систему: ");

        while (count < maxTry) {
            if (new Login().tryLog(user)) {
                boolean cmd = true;
                while (cmd) {
                    switch (new MenuInput().input()) {
                        case "1":
                            user.put(basketball);
                            break;
                        case "2":
                            user.put(football);
                            break;
                        case "3":
                            user.put(hockey);
                            break;
                        case "4":
                            user.show();
                            break;
                        case "5":
                            cmd = false;
                            System.out.println("Cia");
                            break;
                        case "6":
                            new Show().print(categoryList);
                            break;
                        default:
                            System.out.println("Wrong input!");
                            break;
                    }
                }
                break;
            }
            else{
                maxTry--;
                System.out.printf("Неверный логин или пароль!\nПопыток осталось: %d\n", maxTry);
            }
        }
    }
}

package org.example.View.ViewMenu;

import org.example.Model.Interfaces.Menu;

public class HomeMenu implements Menu {
    @Override
    public void menu() {
        System.out.println("\nДомашние: \n" +
                "1 - Кошка\n" +
                "2 - Собака\n" +
                "3 - Хомяк\n" +
                "4 - Назад\n");
    }
}

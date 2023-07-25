package org.example.View.ViewMenu;

import org.example.Model.Interfaces.Menu;

public class TypeMenu implements Menu {
    @Override
    public void menu() {
        System.out.println("\nВид: \n" +
                "1 - Домашние\n" +
                "2 - Вьючные\n" +
                "3 - Назад\n");
    }
}

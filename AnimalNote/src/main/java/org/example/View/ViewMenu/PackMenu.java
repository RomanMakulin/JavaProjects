package org.example.View.ViewMenu;

import org.example.Model.Interfaces.Menu;

public class PackMenu implements Menu {
    @Override
    public void menu() {
        System.out.println("\nВьючные: \n" +
                "1 - Лошадь\n" +
                "2 - Верблюд\n" +
                "3 - Осел\n" +
                "4 - Назад\n");
    }
}

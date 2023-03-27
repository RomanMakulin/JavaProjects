package org.example.View;

import org.example.Model.Interfaces.ViewMenu;

public class FilterMenu implements ViewMenu {
    @Override
    public void menu() {
        System.out.println("1 - выборка по зарплате\n2 - выборка по комментарию");
    }
}

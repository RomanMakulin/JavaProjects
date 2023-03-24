package org.example.View;

import org.example.Model.Interfaces.ViewMenu;
import org.example.Model.Phonebook;

public class MenuUpdate implements ViewMenu {
    @Override
    public void menu(Phonebook book) {
        System.out.println("Что хотите изменить?\n" +
                "1 - изменить имя\n" +
                "2 - изменить телефонный номер\n" +
                "3 - изменить зарплату\n" +
                "4 - изменить комментарий");
    }
}

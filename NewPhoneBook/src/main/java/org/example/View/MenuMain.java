package org.example.View;

import org.example.Model.Interfaces.ViewMenu;
import org.example.Model.Phonebook;

public class MenuMain implements ViewMenu {
    @Override
    public void menu(Phonebook book) {
        System.out.println(book);
        System.out.println("1 - добавить новый контакт;\n2 - удалить контакт;\n3 - обновить контакт;\n" +
                "4 - получить данные о контакте по персональному ID;\n5 - выборка контактов по категории\n" +
                "6 - сохранить телефонную книгу в файл\n7 - закрыть приложение.");
    }
}

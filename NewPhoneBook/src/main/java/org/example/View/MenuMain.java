package org.example.View;

import org.example.Model.Interfaces.ViewMenu;

public class MenuMain implements ViewMenu {
    @Override
    public void menu() {
        System.out.println("1 - добавить новый контакт;\n2 - удалить контакт;\n3 - обновить контакт;\n" +
                "4 - получить данные о контакте по персональному ID;\n5 - выборка контактов по категории\n" +
                "6 - сохранить телефонную книгу в файл\n8 - закрыть приложение;\n9 - закрыть приложение.");
    }
}

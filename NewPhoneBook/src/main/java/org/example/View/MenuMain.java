package org.example.View;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;

public class MenuMain implements ServiceBook {
    @Override
    public void serviceBook(Phonebook book) {
        System.out.println(book);
        System.out.println("1 - добавить новый контакт;\n2 - удалить контакт;\n3 - обновить контакт;\n" +
                "4 - получить данные о контакте по персональному ID;\n5 - выборка контактов по категории\n" +
                "6 - сохранить телефонную книгу в файл\n7 - закрыть приложение.");
    }
}

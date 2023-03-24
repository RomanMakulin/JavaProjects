package org.example.Model.UpdateBook;

import org.example.Model.Contact;
import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Phonebook;
import org.example.View.Input;

public class AddContactBook implements ServiceBook {
    @Override
    public void updateBook(Phonebook book) {
        book.add(new Contact(new Input().input("Введите имя пользователя: "),
                Long.parseLong(new Input().input("Введите номер телефона: ")),
                Integer.parseInt(new Input().input("Введите зарплату: ")),
                new Input().input("Введите комментарий: ")));
    }
}

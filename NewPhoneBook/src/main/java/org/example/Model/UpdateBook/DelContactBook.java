package org.example.Model.UpdateBook;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Phonebook;
import org.example.View.Input;

public class DelContactBook implements ServiceBook {
    @Override
    public void updateBook(Phonebook book) {
        int removeID = Integer.parseInt(new Input().input("Введите ID контакта: "));
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getId() == removeID) {
                book.delete(book.get(i));
                break;
            }
        }
    }
}

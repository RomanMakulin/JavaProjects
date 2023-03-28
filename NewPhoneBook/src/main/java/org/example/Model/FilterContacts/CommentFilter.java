package org.example.Model.FilterContacts;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;
import org.example.View.Input;

public class CommentFilter implements ServiceBook {
    @Override
    public void serviceBook(Phonebook book) {
        String comm = new Input().input("Введите комментарий: ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getComment().equals(comm)) System.out.println(book.get(i));
        }
    }
}

package org.example.Model;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Interfaces.SetInfo;
import org.example.View.Input;

public class GetContactInfo implements ServiceBook {
    @Override
    public void updateBook(Phonebook book) {
        int needID = Integer.parseInt(new Input().input("Введите ID контакта: "));
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getId() == needID){
                System.out.println(book.get(i));
            }
        }
    }
}

package org.example.Model.SetNewInfo;

import org.example.Model.Interfaces.SetInfo;
import org.example.Model.Models.Phonebook;
import org.example.View.Input;

public class Name implements SetInfo {
    @Override
    public void setInfo(Phonebook book, int needId) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getId() == needId) {
                book.get(i).setName(new Input().input("Введите новое имя: "));
            }
        }
    }
}

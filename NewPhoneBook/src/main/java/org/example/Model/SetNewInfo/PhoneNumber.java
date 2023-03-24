package org.example.Model.SetNewInfo;

import org.example.Model.Interfaces.SetInfo;
import org.example.Model.Phonebook;
import org.example.View.Input;

public class PhoneNumber implements SetInfo {
    @Override
    public void setInfo(Phonebook book, int needId) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getId() == needId) {
                book.get(i).setPhoneNumber(Integer.parseInt(new Input().input("Введите новый телефон: ")));
            }
        }
    }
}

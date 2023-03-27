package org.example.View;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;

public class MenuFilter implements ServiceBook {
    @Override
    public void serviceBook(Phonebook book) {
        System.out.println("1 - выборка по зарплате\n2 - выборка по комменарию");
    }
}

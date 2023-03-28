package org.example.Model.FilterContacts;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;
import org.example.View.Input;

public class SalaryFilter implements ServiceBook {
    @Override
    public void serviceBook(Phonebook book) {
        int salary = Integer.parseInt(new Input().input("Введите зарплату: "));
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getSalary() == salary) {
                System.out.println(book.get(i));
            }
        }
    }
}

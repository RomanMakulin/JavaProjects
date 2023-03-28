package org.example.Model.FilterContacts;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;
import org.example.View.FilterMenu;

import java.util.Scanner;

public class SearchContacts implements ServiceBook {

    @Override
    public void serviceBook(Phonebook book) {
        new FilterMenu().menu();
        switch (new Scanner(System.in).nextLine()) {

            case "1":
                new SalaryFilter().serviceBook(book);
                break;

            case "2":
                new CommentFilter().serviceBook(book);
                break;
        }
    }
}

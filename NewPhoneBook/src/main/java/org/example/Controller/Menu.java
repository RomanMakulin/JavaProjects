package org.example.Controller;

import org.example.Model.GetContactInfo;
import org.example.Model.Phonebook;
import org.example.Model.UpdateBook.AddContactBook;
import org.example.Model.UpdateBook.DelContactBook;
import org.example.Model.UpdateBook.UpdateContact;
import org.example.View.Input;
import org.example.View.MenuMain;

import java.util.Scanner;

public class Menu {
    public void menu(Phonebook book) {
        new MenuMain().menu(book);
        boolean progress = true;

        while (progress) {
            switch (new Scanner(System.in).nextLine()) {

                case "1":
                    new AddContactBook().updateBook(book);
                    break;

                case "2":
                    new DelContactBook().updateBook(book);
                    break;

                case "3":
                    new UpdateContact().updateBook(book);
                    break;

                case "4":
                    new GetContactInfo().updateBook(book);
                    break;

                case "7":
                    progress = false;
                    System.out.println("Cia");
                    break;


            }
            if (progress == true) new MenuMain().menu(book);
        }

    }
}

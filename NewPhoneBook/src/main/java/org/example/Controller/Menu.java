package org.example.Controller;

import org.example.Model.GetContactInfo;
import org.example.Model.Models.Phonebook;
import org.example.Model.FileWorkPack.SaveAsFile;
import org.example.Model.UpdateBook.AddContactBook;
import org.example.Model.UpdateBook.DelContactBook;
import org.example.Model.FilterContacts.SearchContacts;
import org.example.Model.UpdateBook.UpdateContact;
import org.example.View.MenuMain;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void menu(Phonebook book) throws IOException {
        new MenuMain().serviceBook(book);
        boolean progress = true;

        while (progress) {
            switch (new Scanner(System.in).nextLine()) {

                case "1":
                    new AddContactBook().serviceBook(book);
                    break;

                case "2":
                    new DelContactBook().serviceBook(book);
                    break;

                case "3":
                    new UpdateContact().serviceBook(book);
                    break;

                case "4":
                    new GetContactInfo().serviceBook(book);
                    break;

                case "5":
                    new SearchContacts().serviceBook(book);
                    break;

                case "6":
                    new SaveAsFile().save(book);
                    break;

                case "7":
                    progress = false;
                    System.out.println("Cia");
                    break;


            }
            if (progress == true) new MenuMain().serviceBook(book);
        }

    }
}

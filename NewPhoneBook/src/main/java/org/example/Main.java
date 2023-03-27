package org.example;

import org.example.Controller.Controller;
import org.example.Controller.Menu;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        Phonebook book = new Controller().CreatePhonebookFile(); // create phone book from file !BUTTON
//        new Menu().menu(book); // action menu !BUTTONPhonebook book = new Controller().CreatePhonebookFile(); // create phone book from file !BUTTON

        new Menu().menu(new Controller().CreatePhonebookFile()); // action menu (generate book from file) !BUTTON

    }
}
package org.example;


import org.example.Controller.Controller;
import org.example.Controller.Menu;
import org.example.Model.Phonebook;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        Phonebook book = new Controller().CreatePhonebookFile(); // create phone book from file !BUTTON
//        new Menu().menu(book); // action menu !BUTTONPhonebook book = new Controller().CreatePhonebookFile(); // create phone book from file !BUTTON

        new Menu().menu(new Controller().CreatePhonebookFile()); // action menu (generate book from file) !BUTTON

        // D:\Road to developer\IT_WorkPlace\OriginWorkPlace\JavaProjects\NewPhoneBook\src\main\java\org\example\phonebook.db
        // C:\Users\WayWayz\Work_Place\JavaProjects\JavaProjects\NewPhoneBook\src\main\java\org\example\phonebook.db
    }
}
package org.example.Controller;

import org.example.Model.UpdateBook.AddContactBook;
import org.example.Model.UpdateBook.DelContactBook;
import org.example.Model.UpdateBook.UpdateContact;
import org.example.Model.Phonebook;
import org.example.View.Input;
import org.example.View.MenuMain;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Controller {
    public Phonebook CreatePhonebookFile() throws FileNotFoundException {

        Phonebook book = new Phonebook();
        new FileWork().loadFile(book, new FileReader(new Input().input("Введите путь к файлу: ")));
        return book;
    }
}

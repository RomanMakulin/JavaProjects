package org.example.Controller;

import org.example.Model.FileWorkPack.FileWork;
import org.example.Model.Models.Phonebook;

public class Controller {
    public Phonebook CreatePhonebookFile(){

        Phonebook book = new Phonebook();
        new FileWork().loadFile(book);
        return book;
    }
}

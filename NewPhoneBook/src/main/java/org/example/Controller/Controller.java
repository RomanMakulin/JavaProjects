package org.example.Controller;

import org.example.Model.FileWorkPack.FileWork;
import org.example.Model.Models.Phonebook;
import org.example.View.Input;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Controller {
    public Phonebook CreatePhonebookFile() throws FileNotFoundException {

        Phonebook book = new Phonebook();
        new FileWork().loadFile(book, new FileReader(new Input().input("[Открыть] Введите имя файла: ")));
        return book;
    }
}

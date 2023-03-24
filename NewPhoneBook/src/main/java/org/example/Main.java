package org.example;

import org.example.Controller.FileWork;
import org.example.Model.Contact;
import org.example.Model.Phonebook;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

       Phonebook book = new Phonebook();
        FileWork fileWork = new FileWork();

        fileWork.loadFile(book, new FileReader("D:\\Road to developer\\IT_WorkPlace\\OriginWorkPlace\\JavaProjects\\NewPhoneBook\\src\\main\\java\\org\\example\\phonebook.db"));

        // функционал создания контактов
//       book.add(new Contact("RomanForDel", 898832134, 300000, "Main"));
//       book.add(new Contact("Olga", 899534536, 250000, "Middle"));
//       book.add(new Contact("Roman", 898832134, 300000, "Main"));
//       book.delete(book.get(0));


        System.out.println(book);
    }
}
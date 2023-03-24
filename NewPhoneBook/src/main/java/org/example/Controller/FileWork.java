package org.example.Controller;

import org.example.Model.Contact;
import org.example.Model.Phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileWork {
    public void loadFile(Phonebook book, FileReader fr) {
        try {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNext()) {
                String[] contacts = scanner.nextLine().split(";");
                book.add(new Contact(contacts[0], Long.parseLong(contacts[1]), Integer.parseInt(contacts[2]), contacts[3]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package org.example.Model.FileWorkPack;

import org.example.Model.Models.Contact;
import org.example.Model.Models.Phonebook;
import java.io.FileReader;
import java.util.Scanner;

public class FileWork {
    public void loadFile(Phonebook book, FileReader fr) {
        try {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNext()) {
                String[] contacts = scanner.nextLine().split(";");
                book.add(new Contact(contacts[0], Long.parseLong(contacts[1]), Integer.parseInt(contacts[2]), contacts[3]));
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

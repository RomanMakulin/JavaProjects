package org.example.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.example.Config;
import org.example.Core.Infrastructure.Phonebook;
import org.example.Core.Models.Contact;

public class Model {

    Phonebook currentBook;
    private int currentIndex;
    private String path;


    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            // ???...
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader("D:\\Road to developer\\IT_WorkPlace\\OriginWorkPlace\\JavaProjects\\Lessn11\\Ex002Phonebook\\src\\main\\java\\org\\example\\data.db");
            BufferedReader reader = new BufferedReader(fr);
            String name = reader.readLine();
            while (name != null) {
                String phone = reader.readLine();
                int salary = Integer.parseInt(reader.readLine());
                String company = reader.readLine();
                String email = reader.readLine();
                this.currentBook.add(new Contact(name, phone, salary, company, email));
                name = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.name));
                writer.append(String.format("%s\n", contact.phone));
                writer.append(String.format("%d\n", contact.salary));
                writer.append(String.format("%s\n", contact.company));
                writer.append(String.format("%s\n", contact.email));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}
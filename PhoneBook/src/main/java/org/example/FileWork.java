package org.example;

import org.example.Core.Infrastructure.PhoneBook;
import org.example.Core.Model.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import org.example.Core.Infrastructure.PhoneBook;
import org.example.Core.Model.Contact;

public class FileWork {
    PhoneBook currentBook;
    protected int currentIndex;
    protected String path;

    public FileWork(String path) {
        currentBook = new PhoneBook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact(){
        return currentBook.getContact(currentIndex);
    }


    public PhoneBook parse() {
        try {
            Scanner scanner = new Scanner(new File(
                    "D:\\Road to developer\\IT_WorkPlace\\OriginWorkPlace\\JavaProjects\\PhoneBook\\src\\main\\java\\org\\example\\book.csv"));

            while (scanner.hasNextLine()) {
                currentBook.add(parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return currentBook;
    }

    private static Contact parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";", 5);
        scanner.close();
        return new Contact(values[1],
                Long.parseLong(values[2]),
                Integer.parseInt(values[3]),
                values[4]);
    }
}

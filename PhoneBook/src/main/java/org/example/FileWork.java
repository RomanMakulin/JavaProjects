package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWork {
    public static List<PhoneBook> parse() {
        List<PhoneBook> book = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(
                    "D:\\Road to developer\\IT_WorkPlace\\OriginWorkPlace\\JavaProjects\\PhoneBook\\src\\main\\java\\org\\example\\book.csv"));

            while (scanner.hasNextLine()) {
                book.add(parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return book;
    }

    private static PhoneBook parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";", 5);
        scanner.close();
        return new PhoneBook(Integer.parseInt(values[0]),
                values[1],
                Long.parseLong(values[2]),
                Integer.parseInt(values[3]),
                values[4]);
    }
}

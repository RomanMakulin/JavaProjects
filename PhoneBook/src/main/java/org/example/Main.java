package org.example;

import java.util.List;
import java.util.Scanner;

import static org.example.FileWork.parse;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        List<PhoneBook> book = parse();
        Scanner in = new Scanner(System.in);

        menu.delContact(book, in);
        menu.addContact(book, in);
        menu.print(book);
    }
}
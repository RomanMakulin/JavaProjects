package org.example.Client;

import org.example.Menu;
import org.example.Core.Infrastructure.PhoneBook;

import java.util.List;
import java.util.Scanner;

import static org.example.FileWork.;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        PhoneBook book = parse();
        Scanner in = new Scanner(System.in);

//        menu.delContact(book, in);
//        menu.addContact(book, in);
        menu.print(book);
    }
}
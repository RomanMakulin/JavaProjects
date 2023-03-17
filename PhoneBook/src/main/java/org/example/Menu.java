package org.example;

import org.example.Core.Infrastructure.PhoneBook;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void print(List<PhoneBook> book) {
        for (PhoneBook item : book) {
            System.out.println(item);
        }
    }

//    public void addContact(List<PhoneBook> book, Scanner in) {
//        System.out.println("Введите: имя, номер телефона, зарплату и комментарий");
//        book.add(new PhoneBook(book.get(book.size() - 1).id + 1, in.next(),
//                Long.parseLong(in.next()), Integer.parseInt(in.next()), in.next()));
//    }
//
//    public void delContact(List<PhoneBook> book, Scanner in) {
//        System.out.print("Введите уникальный ID для удаления контакта: ");
//        String delIndex = in.next();
//        for (int i = 0; i < book.size(); i++) {
//            if (book.get(i).id == Integer.parseInt(delIndex)) book.remove(i);
//        }
//    }


}

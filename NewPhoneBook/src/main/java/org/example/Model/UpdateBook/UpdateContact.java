package org.example.Model.UpdateBook;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.SetNewInfo.Comment;
import org.example.Model.SetNewInfo.Name;
import org.example.Model.SetNewInfo.PhoneNumber;
import org.example.Model.SetNewInfo.Salary;
import org.example.Model.Phonebook;
import org.example.View.Input;
import org.example.View.MenuUpdate;

import java.util.Scanner;

public class UpdateContact implements ServiceBook {
    @Override
    public void updateBook(Phonebook book) {

        int needId = Integer.parseInt(new Input().input("Введите ID контакта: "));
        new MenuUpdate().menu(book);
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                new Name().setInfo(book, needId);
                break;

            case "2":
                new PhoneNumber().setInfo(book, needId);
                break;

            case "3":
                new Salary().setInfo(book, needId);
                break;

            case "4":
                new Comment().setInfo(book, needId);
                break;
        }
    }
}

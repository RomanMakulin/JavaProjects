package org.example.db.View;

import java.util.Scanner;

public class Menu {
    public String show(){
        System.out.println("\nWelcome! Its a demo my DataBase connection.\n" +
                "What do you want?\n" +
                "1 - register new user in Data Base\n" +
                "2 - show all already registered users\n" +
                "3 - exit\n");
        return new Scanner(System.in).nextLine();
    }
}

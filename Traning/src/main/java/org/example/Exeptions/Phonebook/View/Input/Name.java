package org.example.Exeptions.Phonebook.View.Input;

import java.util.Scanner;

public class Name implements Input{
    public String input(){
        System.out.print("First Name: ");
        String firstname = new Scanner(System.in).next();

        System.out.print("Last Name: ");
        String lastname = new Scanner(System.in).next();

        System.out.print("Third Name: ");
        String thirdname = new Scanner(System.in).next();

        return firstname + " " + lastname + " " + thirdname;
    }
}

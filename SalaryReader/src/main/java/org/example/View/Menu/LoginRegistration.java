package org.example.View.Menu;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class LoginRegistration implements Input {
    @Override
    public String print() {
        System.out.println("1 - login\n2 - registration");
        return new Scanner(System.in).nextLine();
    }
}

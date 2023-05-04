package org.example.View.Input;

import org.example.Model.Interfaces.InputStr;

import java.util.Scanner;

public class InputLogin implements InputStr {
    @Override
    public String input() {
        System.out.print("Login: ");
        return new Scanner(System.in).nextLine();
    }
}

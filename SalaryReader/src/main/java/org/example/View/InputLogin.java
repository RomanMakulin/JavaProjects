package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputLogin implements Input {
    @Override
    public String print() {
        System.out.println("Login: ");
        return new Scanner(System.in).nextLine();
    }
}

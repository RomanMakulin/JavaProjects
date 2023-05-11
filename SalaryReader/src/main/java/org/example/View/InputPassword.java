package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputPassword implements Input {
    @Override
    public String print() {
        System.out.println("Password: ");
        return new Scanner(System.in).nextLine();
    }
}

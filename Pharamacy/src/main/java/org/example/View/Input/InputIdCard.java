package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputIdCard implements InputInt {
    @Override
    public int input() {
        System.out.print("Card ID: ");
        return new Scanner(System.in).nextInt();
    }
}

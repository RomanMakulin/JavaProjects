package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputNewPin implements InputInt {
    @Override
    public int input() {
        System.out.print("New pin: ");
        return new Scanner(System.in).nextInt();
    }
}

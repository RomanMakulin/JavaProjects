package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputPin implements InputInt {
    @Override
    public int input() {
        System.out.print("Pin: ");
        return new Scanner(System.in).nextInt();
    }
}

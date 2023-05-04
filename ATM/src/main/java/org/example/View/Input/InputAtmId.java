package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputAtmId implements InputInt {
    @Override
    public int input() {
        System.out.print("Введите номер банкомата: ");
        return new Scanner(System.in).nextInt();
    }
}

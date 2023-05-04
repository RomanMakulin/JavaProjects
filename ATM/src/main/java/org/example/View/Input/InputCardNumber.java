package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputCardNumber implements InputInt {
    @Override
    public int input() {
        System.out.print("Введите уникальный номер карты: ");
        return new Scanner(System.in).nextInt();
    }
}

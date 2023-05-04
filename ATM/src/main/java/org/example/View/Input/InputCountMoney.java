package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputCountMoney implements InputInt {
    @Override
    public int input() {
        System.out.print("Введите сумму: ");
        return new Scanner(System.in).nextInt();
    }
}

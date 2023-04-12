package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputNeedMoney implements InputInt {
    @Override
    public int input() {
        System.out.println("Введите сумму пополнения: ");
        return new Scanner(System.in).nextInt();
    }
}

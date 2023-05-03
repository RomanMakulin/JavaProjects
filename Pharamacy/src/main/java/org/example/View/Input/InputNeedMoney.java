package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputNeedMoney implements InputInt {
    @Override
    public int input() {
        System.out.print("Amount you need: ");
        return new Scanner(System.in).nextInt();
    }
}

package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputPassword implements InputInt {
    @Override
    public int input(){
        System.out.println("Введите пароль: ");
        return new Scanner(System.in).nextInt();
    }
}

package org.example.View;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputID implements InputInt {
    @Override
    public int input(){
        System.out.println("Введите ID игрушки: ");
        return new Scanner(System.in).nextInt();
    }
}

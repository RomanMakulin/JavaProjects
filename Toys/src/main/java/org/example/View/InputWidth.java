package org.example.View;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputWidth implements InputInt {
    @Override
    public int print(){
        System.out.println("Введите width игрушки: ");
        return new Scanner(System.in).nextInt();
    }
}

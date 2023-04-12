package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputPriceMedicine implements InputInt {
    @Override
    public int input(){
        System.out.println("Введите стоимость препарата: ");
        return new Scanner(System.in).nextInt();
    }
}

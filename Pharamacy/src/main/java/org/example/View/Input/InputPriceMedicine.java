package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputPriceMedicine implements InputInt {
    @Override
    public int input(){
        System.out.print("Medicine price: ");
        return new Scanner(System.in).nextInt();
    }
}

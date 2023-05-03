package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputCountMedicine implements InputInt {
    @Override
    public int input(){
        System.out.print("Medicine count: ");
        return new Scanner(System.in).nextInt();
    }
}

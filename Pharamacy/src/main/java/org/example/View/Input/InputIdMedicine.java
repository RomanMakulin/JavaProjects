package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputIdMedicine implements InputInt {
    @Override
    public int input(){
        System.out.print("Medicine ID: ");
        return new Scanner(System.in).nextInt();
    }
}

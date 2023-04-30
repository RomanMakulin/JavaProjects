package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputIdProduct implements InputInt {
    @Override
    public int input(){
        System.out.print("Input product's ID for buy: ");
        return new Scanner(System.in).nextInt();
    }
}

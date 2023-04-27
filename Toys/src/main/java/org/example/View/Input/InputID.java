package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputID implements InputInt {
    @Override
    public int input(){
        System.out.println("Input toy's ID: ");
        return new Scanner(System.in).nextInt();
    }
}

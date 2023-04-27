package org.example.View.Input;

import org.example.Model.Interfaces.InputInt;

import java.util.Scanner;

public class InputWidth implements InputInt {
    @Override
    public int input(){
        System.out.println("Input toy's width: ");
        return new Scanner(System.in).nextInt();
    }
}

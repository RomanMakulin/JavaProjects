package org.example.View.Input;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputName implements InputString {
    @Override
    public String input(){
        System.out.println("Input toy's name: ");
        return new Scanner(System.in).nextLine();
    }
}

package org.example.View.Input;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputLogin implements InputString {
    @Override
    public String input(){
        System.out.print("User name: ");
        return new Scanner(System.in).nextLine();
    }
}

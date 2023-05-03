package org.example.View.Input;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputPassword implements InputString {
    @Override
    public String input(){
        System.out.print("Password: ");
        return new Scanner(System.in).nextLine();
    }
}

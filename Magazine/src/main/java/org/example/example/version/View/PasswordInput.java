package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.InputString;

import java.util.Scanner;

public class PasswordInput implements InputString {
    @Override
    public String input(){
        System.out.print("Input your password: ");
        return new Scanner(System.in).nextLine();
    }
}

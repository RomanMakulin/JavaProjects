package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.InputString;

import java.util.Scanner;

public class LoginInput implements InputString {
    @Override
    public String input(){
        System.out.print("Input login: ");
        return new Scanner(System.in).nextLine();
    }
}

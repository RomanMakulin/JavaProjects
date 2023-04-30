package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.InputString;

import java.util.Scanner;

public class RepeatPassword implements InputString {
    @Override
    public String input(){
        System.out.print("Repeat your password: ");
        return new Scanner(System.in).nextLine();
    }
}

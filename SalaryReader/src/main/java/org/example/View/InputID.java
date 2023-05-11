package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputID{
    public int print() {
        System.out.print("Remove ID: ");
        return new Scanner(System.in).nextInt();
    }
}

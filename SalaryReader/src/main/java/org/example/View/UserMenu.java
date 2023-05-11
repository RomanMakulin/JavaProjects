package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class UserMenu implements Input {
    @Override
    public String print() {
        System.out.println("\n1 - salary list\n2 - add salary\n3 - del salary\n4 - higher salary\n5 - lower salary\n" +
                "6 - sorting salary\n7 - close program\n");
        return new Scanner(System.in).nextLine();
    }
}

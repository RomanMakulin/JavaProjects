package org.example.View.Menu;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class ViewSimpleUserMenu implements InputString {
    @Override
    public String input(){
        System.out.println("\n1 - buy medicine\n2 - show your basket" +
                "\n3 - show your money\n4 - increase your money from card\n5 - close app\n");
        return new Scanner(System.in).nextLine();
    }
}

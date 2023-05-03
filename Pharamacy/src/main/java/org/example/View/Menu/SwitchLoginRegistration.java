package org.example.View.Menu;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class SwitchLoginRegistration implements InputString {
    @Override
    public String input(){
        System.out.println("\n1 - login\n2 - registration\n");
        return new Scanner(System.in).nextLine();
    }
}

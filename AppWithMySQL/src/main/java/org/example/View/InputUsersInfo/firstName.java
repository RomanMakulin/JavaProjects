package org.example.View.InputUsersInfo;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class firstName implements Input<String> {
    public String input(){
        System.out.print("\nName: ");
        return new Scanner(System.in).nextLine();
    }
}

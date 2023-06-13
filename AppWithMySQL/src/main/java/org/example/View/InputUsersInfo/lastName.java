package org.example.View.InputUsersInfo;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class lastName implements Input<String> {
    public String input(){
        System.out.print("\nLast name: ");
        return new Scanner(System.in).nextLine();
    }
}

package org.example.View.InputUsersInfo;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class ageInput implements Input<Integer> {
    public Integer input(){
        System.out.print("\nAge: ");
        return new Scanner(System.in).nextInt();
    }
}

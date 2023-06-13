package org.example.View.InputUsersInfo;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputID implements Input<Integer> {
    public Integer input(){
        System.out.print("\nFind id: ");
        return new Scanner(System.in).nextInt();
    }
}

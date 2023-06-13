package org.example.View.InputUsersInfo;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputIdGroup implements Input<Integer> {
    public Integer input(){
        System.out.print("\nInput need ID:\n" +
                "1 - user\n" +
                "2 - talent\n" +
                "3 - administrator\n");
        return new Scanner(System.in).nextInt();
    }
}

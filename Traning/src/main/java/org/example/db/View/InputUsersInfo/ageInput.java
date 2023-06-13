package org.example.db.View.InputUsersInfo;

import java.util.Scanner;

public class ageInput {
    public int input(){
        System.out.println("Age: ");
        return new Scanner(System.in).nextInt();
    }
}

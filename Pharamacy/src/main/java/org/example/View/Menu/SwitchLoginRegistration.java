package org.example.View.Menu;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class SwitchLoginRegistration implements InputString {
    @Override
    public String input(){
        System.out.println("1 - войти\n2 - зарегистрироваться");
        return new Scanner(System.in).nextLine();
    }
}

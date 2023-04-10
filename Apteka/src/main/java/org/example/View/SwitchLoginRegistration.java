package org.example.View;

import java.util.Scanner;

public class SwitchLoginRegistration {
    public String input(){
        System.out.println("1 - войти\n2 - зарегистрироваться");
        return new Scanner(System.in).nextLine();
    }
}

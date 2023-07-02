package org.example.Exeptions.Phonebook.View.Input;

import java.util.Scanner;

public class PhoneInput implements Input{
    @Override
    public Long input() {
        System.out.print("Input ur phone: ");
        return new Scanner(System.in).nextLong();
    }
}

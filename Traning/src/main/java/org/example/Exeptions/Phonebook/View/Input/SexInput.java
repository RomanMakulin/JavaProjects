package org.example.Exeptions.Phonebook.View.Input;

import org.example.Exeptions.Phonebook.View.Exeptions.ErrorInput;

import java.util.Scanner;

public class SexInput implements Input{
    @Override
    public String input() {
        System.out.print("Input sex (male/female): ");
        String sex = new Scanner(System.in).next();
        if (sex.equals("male") || sex.equals("female")){
            return sex;
        }else{
            throw new RuntimeException(new ErrorInput().error());
        }
    }
}

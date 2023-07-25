package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputId implements Input {
    @Override
    public Integer input() {
       try {
           System.out.print("ID животного: ");
           return new Scanner(System.in).nextInt();
       }catch (InputMismatchException e){
           System.out.println(e + ": введена не цифра");
       }
        return -1;
    }
}

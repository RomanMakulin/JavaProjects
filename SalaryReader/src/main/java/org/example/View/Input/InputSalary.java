package org.example.View.Input;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputSalary implements Input {
    @Override
    public Long print() {
        System.out.println("Salary: ");
        return new Scanner(System.in).nextLong();
    }
}

package org.example.example.version.View;

import org.example.example.version.Model.Interfaces.InputString;

import java.util.Scanner;

public class MenuInput implements InputString {
    @Override
    public String input(){
        System.out.println("\nMenu:\n1 - basketball category\n2 - football category" +
                "\n3 - hockey category\n4 - show your basket" +
                "\n5 - show update magazine's assortment \n6 - Finish work\n");
        return new Scanner(System.in).nextLine();
    }
}

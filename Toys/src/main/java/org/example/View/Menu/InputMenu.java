package org.example.View.Menu;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputMenu implements InputString {
    @Override
    public String input(){
        System.out.println("\n** Hey and yo! You are in the interactive menu of our first seasonal draw **\n" +
                "** Choose action: **\n\n" +
                "1 - show all toys list in draw\n" +
                "2 - add new toy in draw\n" +
                "3 - change toys width \n" +
                "4 - delete toy from draw \n" +
                "5 - start drawing!!!\n");
        return new Scanner(System.in).nextLine();
    }
}

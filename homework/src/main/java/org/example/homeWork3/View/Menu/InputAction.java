package org.example.homeWork3.View.Menu;

import java.util.Scanner;

public class InputAction {
    public byte input(){
        System.out.print("Input action (1-3): ");
        return new Scanner(System.in).nextByte();
    }
}

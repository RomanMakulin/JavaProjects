package org.example.Calk.View;

import java.util.Scanner;

public class InputAction {
    public String input() {
        System.out.println("Выберите действие ( +, -, /, *, = ): ");
        return new Scanner(System.in).nextLine();
    }
}

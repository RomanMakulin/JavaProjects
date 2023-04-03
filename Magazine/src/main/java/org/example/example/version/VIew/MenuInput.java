package org.example.example.version.VIew;

import java.util.Scanner;

public class MenuInput {
    public String input(){
        System.out.println("\nМеню управления покупками:\n1 - баскетбольный раздел\n2 - футбольный раздел" +
                "\n3 - хоккейный раздел\n4 - показать корзину" +
                "\n5 - завершить\n6 - показать обновленный ассортимент\n");
        return new Scanner(System.in).nextLine();
    }
}

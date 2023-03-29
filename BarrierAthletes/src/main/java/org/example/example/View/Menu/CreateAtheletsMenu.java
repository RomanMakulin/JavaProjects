package org.example.example.View.Menu;

import java.util.Scanner;

public class CreateAtheletsMenu {
    public String input(){
        System.out.println("Меню создания атлета. Выберите тип:\n" +
                "1 - человек\n2 - кот\n3 - робот");
        return new Scanner(System.in).nextLine();
    }
}

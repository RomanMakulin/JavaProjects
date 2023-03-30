package org.example.example.View.Menu;

import org.example.example.Model.Interfaces.ViewInputStr;

import java.util.Scanner;

public class CreateBarriersMenu implements ViewInputStr {
    @Override
    public String input(){
        System.out.println("Меню создания барьеров. Выберите тип:\n" +
                "1 - стена\n2 - беговая дорожка");
        return new Scanner(System.in).nextLine();
    }
}

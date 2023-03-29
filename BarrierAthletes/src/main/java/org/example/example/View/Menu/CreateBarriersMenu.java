package org.example.example.View.Menu;

import java.util.Scanner;

public class CreateBarriersMenu {
    public String input(){
        System.out.println("Меню создания барьеров. Выберите тип:\n" +
                "1 - стена\n2 - беговая дорожка");
        return new Scanner(System.in).nextLine();
    }
}

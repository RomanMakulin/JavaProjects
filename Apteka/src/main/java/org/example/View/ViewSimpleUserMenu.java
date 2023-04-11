package org.example.View;

import java.util.Scanner;

public class ViewSimpleUserMenu {
    public String menu(){
        System.out.println("1 - купить лекарство\n2 - показать корзину покупок\n3 - завершить работу");
        return new Scanner(System.in).nextLine();
    }
}

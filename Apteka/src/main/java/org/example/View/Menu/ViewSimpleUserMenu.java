package org.example.View.Menu;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class ViewSimpleUserMenu implements InputString {
    @Override
    public String input(){
        System.out.println("1 - купить лекарство\n2 - показать корзину покупок" +
                "\n3 - показать доступные средства\n4 - завершить работу");
        return new Scanner(System.in).nextLine();
    }
}

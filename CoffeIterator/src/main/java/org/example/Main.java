package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Beverage latte = new Coffe();
        latte.addComponent(new Milk("Домик в деревне", 1.0));
        latte.addComponent(new Water("Из под крана", 2.0));
        latte.addComponent(new Beans("Nescafe Gold", 0.1));

        Iterator<Ingridient> item = latte;
        while (item.hasNext()){
            System.out.println(item.next());;
        }
    }
}
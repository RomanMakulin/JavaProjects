package org.example.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    Product[] buy;
    static int count = 0;

    public Basket(Product[] buy) {
        this.buy = buy;
    }

    public Basket() {
        this.buy = new Product[10];
    }

    public void put(int numberProductCaterory, Product[] category) {
        buy[count] = category[numberProductCaterory];
        count++; // щелкаем позиции при добавлении нового товара
        category[numberProductCaterory] = null;
    }

    public void showBasket() {
        StringBuilder m_list = new StringBuilder();
        int number = 1;
        for (Product item : buy) {
            if (item != null) {
                m_list.append(String.format("%d) ", number++));
                m_list.append(item.prodInfo());
                m_list.append("\n");
            }
        }
        System.out.println(m_list);
    }

}

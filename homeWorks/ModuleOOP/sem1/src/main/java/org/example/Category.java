package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Category {
    public String name;
    public Product[] AllProducts;

    public Category(String name, Product[] allProducts) {
        this.name = name;
        AllProducts = allProducts;
    }

    @Override
    public String toString() {
        StringBuilder m_list = new StringBuilder();
        for (Product item : AllProducts) {
            if (item != null) {
                m_list.append(item.prodInfo());
                m_list.append("\n");
            }
        }
        return String.format("%s:\n%s", name, m_list);
    }

}

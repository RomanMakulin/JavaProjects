package org.example.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Category extends Product {
//    public String name;
    public Product[] AllProducts;

    public Category(String name, Product[] allProducts) {
        super(name, 0, 0);
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

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

        return String.format("%s:\n%s", name, Arrays.toString(AllProducts));
    }

}

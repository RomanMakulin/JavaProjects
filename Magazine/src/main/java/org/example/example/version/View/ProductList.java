package org.example.example.version.View;

import org.example.example.version.Model.Products.Category;

import java.util.List;

public class ProductList {
    public void show(List<Category> categoryList){
        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println(categoryList.get(i).getCatName());
            for (int j = 0; j < categoryList.get(i).size(); j++) {
                System.out.println(categoryList.get(i).get(j));
            }
            System.out.println();
        }
    }
}

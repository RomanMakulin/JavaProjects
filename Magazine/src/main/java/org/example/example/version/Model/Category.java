package org.example.example.version.Model;

import java.util.List;

public class Category extends Product {
    List<Product> productList;
    private String catName;
    public Category(String name, List<Product> productList) {
        super(name, 0);
        this.catName = name;
        this.productList = productList;
    }

    public Product get(int i){
        return this.productList.get(i);
    }

    @Override
    public String toString() {
        return catName + " {" +
                "productList=" + productList +
                '}';
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}

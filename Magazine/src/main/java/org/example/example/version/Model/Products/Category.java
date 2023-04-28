package org.example.example.version.Model.Products;

import java.util.List;

public class Category extends Product {
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    private List<Product> productList;
    private String catName;
    public Category(String name, List<Product> productList) {
        super(name, 0);
        this.catName = name;
        this.productList = productList;
    }

    public Product get(int i){
        return this.productList.get(i);
    }

    public int size(){
        return this.productList.size();
    }

    @Override
    public String toString() {
        return catName + ": "+ productList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}

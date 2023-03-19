package org.example.Warehouse.Impl;

import org.example.Warehouse.Product;

import java.util.List;

public interface ChangeWarehouse {
    public void addProduct(List<Product> products);
    public void removeProduct(List<Product> products);
    public void decreaseProduct(Product products, int amount);
    public void increaseProduct(Product products, int amount);
}

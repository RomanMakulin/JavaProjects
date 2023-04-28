package org.example.example.version.Controller.ProductsList.FileWork;

import org.example.example.version.Model.Products.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWork {
    public List<Product> readFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                productList.add(new Parsing().parse(scanner.nextLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}

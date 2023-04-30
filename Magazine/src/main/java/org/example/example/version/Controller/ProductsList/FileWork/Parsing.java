package org.example.example.version.Controller.ProductsList.FileWork;

import org.example.example.version.Model.Products.Product;

import java.util.Scanner;

public class Parsing {
    public Product parse (String line){
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        return new Product(values[0], Integer.parseInt(values[1]));
    }
}

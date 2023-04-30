package org.example.example.version.Controller.ProductsList.SaveFile;

import org.example.example.version.Controller.ProductsList.ReadFile.Parsing;
import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.Products.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class SaveFile {
    public void save(List<Product> productList, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < productList.size(); i++) {
                bufferedWriter.write(productList.get(i).getName() + ";" + productList.get(i).getPrice() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

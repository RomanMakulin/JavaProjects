package org.example.example.version.Controller;

import org.example.example.version.Controller.ProductsList.FileWork.SaveFile;
import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;

import java.util.List;

public class ActionBuy {
    public void buy(User user, List<Category> categoryList, String category){

        categoryList.stream().
                        filter(item -> item.getCatName().
                        equals(category)).
                        forEach(item -> putSave(user, item, category));
    }
    public void putSave(User user, Category item, String category){
        user.put(item.getProductList());
        new SaveFile().save(item.getProductList(), category + ".csv");
    }
}

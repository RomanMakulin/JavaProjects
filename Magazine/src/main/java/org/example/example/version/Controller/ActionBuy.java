package org.example.example.version.Controller;

import org.example.example.version.Model.Products.Category;
import org.example.example.version.Model.User.User;

import java.util.List;

public class ActionBuy {
    public void buy(User user, List<Category> categoryList, String category){
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getCatName().equals(category)){
                user.put(categoryList.get(i).getProductList());
            }
        }
    }
}

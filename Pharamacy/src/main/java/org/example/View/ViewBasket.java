package org.example.View;

import org.example.Model.Pharmacy;
import org.example.Model.User;

import java.util.List;

public class ViewBasket {
    public void show(User user){
        System.out.println("Your basket: ");
        for (int k = 0; k < user.getBasket().size(); k++) {
            System.out.println(user.getBasket().get(k));
        }
    }
}

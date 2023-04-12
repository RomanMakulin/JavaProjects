package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;

public class ViewBasket {
    public void show(List<Pharmacy> pharmacyList, int i, int j){
        System.out.println("Корзина покупок: ");
        for (int k = 0; k < pharmacyList.get(i).getUserList().get(j).getBasket().size(); k++) {
            System.out.println(pharmacyList.get(i).getUserList().get(j).getBasket().get(k));
        }
    }
}

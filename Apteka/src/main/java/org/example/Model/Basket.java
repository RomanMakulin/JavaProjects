package org.example.Model;

import org.example.View.InputCountMedicine;
import org.example.View.InputIdMedicine;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Medicines> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public void put(List<Medicines> medicinesList) {

        int id = new InputIdMedicine().input();
        int needCount = new InputCountMedicine().input();
        int currentCountM = medicinesList.get(id).getCount();
        int newCurrent = currentCountM - needCount;

        if (newCurrent >= 0) {
            medicinesList.get(id).setCount(newCurrent);
            basketList.add(new Medicines(medicinesList.get(id).getName(), medicinesList.get(id).getPrice(), needCount));
        }


    }

    public void del(List<Medicines> medicinesList) {
//        int temp = medicinesList.get(id).getCount();
//        int result = temp - count;
//        medicinesList.get(id).setCount(result);
    }

    public void show() {

        System.out.println(basketList);
    }

    @Override
    public String toString() {
        return "Basket: " + basketList;
    }
}
